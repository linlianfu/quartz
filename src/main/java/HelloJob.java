import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Author: calvin
 * @Since: 2018/3/23 22:13
 * @Description:
 */
public class HelloJob implements Job {
    public void execute(JobExecutionContext context) throws JobExecutionException {

        String groupName = context.getJobDetail().getJobDataMap().get("group").toString();
        System.out.println("任务被执行:"+groupName);
    }
}
