package localtest.service.schedule;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Author: Eleven
 * @Since: 2018/4/1 14:57
 * @Description:
 */
@Slf4j
public class ExportQuestionJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("运维平台添加的任务开始执行。。。。。");
    }
}
