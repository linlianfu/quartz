package priv.llf.quartz;

import priv.llf.quartz.dto.UserJobDetail;

/**
 * @Author: calvin
 * @Since: 2018/3/10 11:04
 * @Description:
 */
public interface IUserJobClient {
    /**
     * 执行一个任务
     */
    boolean execute(UserJobDetail userJobDetail) throws Exception;
}
