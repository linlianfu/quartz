package localtest.gateway.web.admin;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.impl.JobDetailImpl;
import priv.llf.quartz.UserJobExecutor;

/**
 * @Author: calvin
 * @Since: 2018/3/23 22:13
 * @Description:
 */
public class HelloJob implements UserJobExecutor {

    public void execute(JobExecutionContext context) throws JobExecutionException {
        String groupName = ((JobDetailImpl)context.getJobDetail()).getGroup();
        System.out.println("任务被执行:"+groupName);
    }
}
