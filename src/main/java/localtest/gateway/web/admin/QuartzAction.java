package localtest.gateway.web.admin;

import lombok.extern.slf4j.Slf4j;
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

    @ResponseBody
    @RequestMapping(value = "getQuartz",method = RequestMethod.GET)
    public void getQuartz(){
        log.info("定时项目初始化。。。。。。");
    }
}
