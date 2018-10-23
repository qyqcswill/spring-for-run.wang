package com.baidu.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String returnHelloWord(){

        return "hello word";
    }
}
