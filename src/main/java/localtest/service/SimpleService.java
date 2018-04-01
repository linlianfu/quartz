package localtest.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: calvin
 * @Since: 2018/3/26 21:38
 * @Description:
 */
@Slf4j
@Service("simpleService")
public class SimpleService {
    private static final long serialVersionUID = 122323233244334343L;
    SimpleService(){
        log.info("simpleService实例化");
    }
    public void testMethod1(){
        //这里执行定时调度业务
        log.info("定时器任务开始执行.......");
    }

}
