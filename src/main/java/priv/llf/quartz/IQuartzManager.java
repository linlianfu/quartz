package priv.llf.quartz;

import priv.llf.quartz.dto.QuartzDto;

/**
 * @Author: calvin
 * @Since: 2018/3/10 11:04
 * @Description:
 */
public interface IQuartzManager {

    /**
     *创建一个调度器，并在cronExpression指定的时间触发
     *该方法只适合单机操作，如果存在多台服务器同时运行一个job，则会导致数据翻倍
     * 考虑调度器集群
     * @param dto
     */
    void createQuartz(QuartzDto dto);


    /**
     *创建一个固定间隔的调度器并触发
     * 后期需要全局拦截已异常
     * @param dto
     */
    void createQuartzAndTriggerByFixedInterval(QuartzDto dto) throws Exception;
}
