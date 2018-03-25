package priv.llf.quartz.impl;

import org.quartz.*;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import priv.llf.quartz.IQuartzManager;
import priv.llf.quartz.dto.QuartzDto;

import java.text.ParseException;

/**
 * @Author: calvin
 * @Since: 2018/3/25 11:39
 * @Description:
 */
public class QuartzManagerImpl implements IQuartzManager,InitializingBean,DisposableBean{

    Scheduler scheduler;

    public void createQuartz(QuartzDto dto) {
        try {
            if (scheduler == null){
                scheduler = StdSchedulerFactory.getDefaultScheduler();
            }
            boolean exists = scheduler.checkExists(new JobKey(dto.getName(),dto.getGroup()));
            if (!exists){
                Trigger trigger = null;
                try {
                    trigger = TriggerBuilder.newTrigger()
                            .withSchedule(
                                    CronScheduleBuilder.cronSchedule(
                                            new CronExpression(dto.getCronExpression())
                                    )
                            ).build();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                JobDetailImpl jobDetail = new JobDetailImpl();
                jobDetail.setJobClass(dto.getJobClass());
                jobDetail.setName(dto.getName());
                jobDetail.setGroup(dto.getGroup());

                scheduler.scheduleJob(jobDetail,trigger);
                scheduler.start();
            }else{
                System.out.println("相同的任务已经触发过");
            }
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public void createQuartzAndTriggerByFixedInterval(QuartzDto dto) throws Exception {
        int minuter = dto.getIntervalMinuter();
        if (minuter<=0)throw new Exception("间隔分钟不能为空");
        if (minuter>=60) throw new Exception("分钟阈值超出");
        String cronExpression = "0 0/"+dto.getIntervalMinuter()+" * * * ?";
        dto.setCronExpression(cronExpression);
        this.createQuartz(dto);
    }


    public void afterPropertiesSet() throws Exception {
        if (scheduler == null){
            scheduler = StdSchedulerFactory.getDefaultScheduler();
        }
    }

    public void destroy() throws Exception {
        System.out.println("关闭调度器");
        scheduler.shutdown();
    }
}
