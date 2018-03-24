import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;

import java.util.Date;



/**
 * @Author: calvin
 * @Since: 2018/3/23 21:55
 * @Description:
 */
public class ScheduleTest {

    public static void main(String[] arg){
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();
            JobDetailImpl job = new JobDetailImpl();
            job.setJobClass(HelloJob.class);
            job.setName("myJob");
            job.setGroup("myGroup");
            job.getJobDataMap().put("group","asyncExportQuestion");
            job.getJobDataMap().put("job say","I'M is jobs");
            SimpleTriggerImpl simpleTrigger = new SimpleTriggerImpl(
                    "myTrigger","myGroup",new Date(),
                    null,0,0
            );
//            TriggerBuilder.newTrigger().;
            simpleTrigger.getJobDataMap().put("triggerSay","my name is trigger");
            scheduler.scheduleJob(job, simpleTrigger);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
