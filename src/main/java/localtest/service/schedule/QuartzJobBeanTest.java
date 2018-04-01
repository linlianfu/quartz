package localtest.service.schedule;

import localtest.service.SimpleService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: calvin
 * @Since: 2018/3/26 21:39
 * @Description:
 */
@Slf4j
@PersistJobDataAfterExecution
@DisallowConcurrentExecution// 不允许并发执行
public class QuartzJobBeanTest implements Job{
    @Autowired
    SimpleService simpleService;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        simpleService.testMethod1();
    }
}
