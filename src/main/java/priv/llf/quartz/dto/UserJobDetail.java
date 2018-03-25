package priv.llf.quartz.dto;

import lombok.Data;
import org.quartz.JobDataMap;
import priv.llf.quartz.UserJobExecutor;

import java.io.Serializable;

/**
 * @Author: calvin
 * @Since: 2018/3/24 21:34
 * @Description:
 */
@Data
public class UserJobDetail  implements Serializable{

    private String group;

    private String name;

    private JobDataMap jobDataMap;

    Class<? extends UserJobExecutor> jobClass;
}
