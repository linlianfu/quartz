package priv.llf.quartz.impl;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.stereotype.Service;
import priv.llf.quartz.IUserJobClient;
import priv.llf.quartz.dto.UserJobDetail;

/**
 * @Author: calvin
 * @Since: 2018/3/24 21:32
 * @Description:
 */
@Slf4j
@Service
public class UserJobClientImpl implements IUserJobClient {
    UserJobClientImpl(){
        log.info("UserJobClientImpl实例化");
    }

    public boolean execute(UserJobDetail userJobDetail) throws Exception {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();

            JobDetailImpl jobDetail = new JobDetailImpl();
            jobDetail.setGroup(userJobDetail.getGroup());
            jobDetail.setName(userJobDetail.getName());
            jobDetail.setJobClass(userJobDetail.getJobClass());
            jobDetail.setJobDataMap(userJobDetail.getJobDataMap());

            Trigger trigger = TriggerBuilder.newTrigger()
                    .build();
            scheduler.scheduleJob(jobDetail, trigger);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

        return false;
    }
}
