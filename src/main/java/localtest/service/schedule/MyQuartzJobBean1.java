package localtest.service.schedule;

import localtest.service.SimpleService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @Author: calvin
 * @Since: 2018/3/26 21:39
 * @Description:
 */
@Slf4j
@PersistJobDataAfterExecution
@DisallowConcurrentExecution// 不允许并发执行
public class MyQuartzJobBean1 extends QuartzJobBean {
    @Autowired
    SimpleService simpleService;
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        simpleService.testMethod1();
    }
}
