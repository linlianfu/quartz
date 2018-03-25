package priv.llf.quartz.dto;

import lombok.Data;
import org.quartz.JobDataMap;
import priv.llf.quartz.UserJobExecutor;

import java.io.Serializable;

/**
 * @Author: calvin
 * @Since: 2018/3/25 11:40
 * @Description:
 */
@Data
public class QuartzDto implements Serializable {
    /**
     * 组名
     */
    private String group;
    /**
     * 调度器名字
     */
    private String name;

    private JobDataMap jobDataMap;

    Class<? extends UserJobExecutor> jobClass;
    /**
    Cron-Expressions用于配置CronTrigger的实例。
     Cron Expressions是由七个子表达式组成的字符串，用于描述日程表的各个细节。
     这些子表达式用空格分隔，并表示：
    Seconds
    Minutes
    Hours
    Day-of-Month
    Month
    Day-of-Week
    Year (optional field)
    一个完整的Cron-Expressions的例子是字符串“0 0 12？* WED“ - 这意味着”每个星期三下午12:00“。
    **/
    String cronExpression;
    /**
     * 间隔分钟
     */
    int intervalMinuter;


}
