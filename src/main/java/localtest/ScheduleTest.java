package localtest;

import priv.llf.quartz.IQuartzManager;
import priv.llf.quartz.dto.QuartzDto;
import priv.llf.quartz.impl.QuartzManagerImpl;
/**
 * @Author: calvin
 * @Since: 2018/3/23 21:55
 * @Description:
 */
public class ScheduleTest {

    public static void main(String[] arg){

        IQuartzManager quartzManager = new QuartzManagerImpl();

        QuartzDto quartzDto = new QuartzDto();

        quartzDto.setGroup("定时服务1");
//        quartzDto.setCronExpression("0 15 14 * * ?");
        quartzDto.setJobClass(HelloJob.class);
        quartzDto.setName("定时服务任务1");
//        quartzManager.createQuartz(quartzDto);

//        quartzDto.setName("定时服务任务2");
//        quartzDto.setGroup("定时服务2");
//        quartzManager.createQuartz(quartzDto);

        quartzDto.setIntervalMinuter(1);
        try {
            quartzManager.createQuartzAndTriggerByFixedInterval(quartzDto);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
