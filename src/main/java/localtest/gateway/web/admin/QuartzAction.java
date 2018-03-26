package localtest.gateway.web.admin;

import localtest.service.SimpleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: calvin
 * @Since: 2018/3/26 21:20
 * @Description:
 */
@Slf4j
@Controller
@RequestMapping("quartz")
public class QuartzAction {
    @Autowired
    SimpleService simpleService;
    @ResponseBody
    @RequestMapping(value = "getQuartz",method = RequestMethod.GET)
    public void getQuartz(){
        log.info("定时项目初始化。。。。。。");
    }


//    @ResponseBody
//    @RequestMapping(value = "excuteSchedule",method = RequestMethod.GET)
//    public void executeSchedule(){
//    }


}
