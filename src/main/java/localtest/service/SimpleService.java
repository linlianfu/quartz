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

    public void testMethod1(){
        //这里执行定时调度业务
        log.info("testMethod1.......1");
        System.out.println("2--testMethod1......."+System.currentTimeMillis()/1000);
    }

    public void testMethod2(){
        log.info("testMethod2.......2");
    }
}
