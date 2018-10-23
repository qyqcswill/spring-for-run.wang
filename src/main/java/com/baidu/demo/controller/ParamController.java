package com.baidu.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class ParamController {


    /*
    *  获取 request param : name 和 sex 通过 HttpServletRequest
    *
    *  url:/hello/01?name=run&sex=man
    * */
    @ResponseBody
    @RequestMapping(value = "/hello/01",method = RequestMethod.GET)
    public String getParam(HttpServletRequest request){
        // 需要request 对象
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        log.info("------------------start---------------------------");
        log.info(name);
        log.info(sex);
        return "success";
    }

    /*
    *
    * 使用注解获取参数
    * url:/hello/02?name=run&sex=man
    * */
    @ResponseBody
    @RequestMapping(value = "/hello/02",method = RequestMethod.GET)
    public String getParamByAnn(@RequestParam(value = "name")String name,
                                @RequestParam(value = "sex",required = false,defaultValue = "women")String sex){
        log.info("------------------start /hello/02---------------------------");
        log.info(name);
        log.info(sex);
        return "success";
    }
}
