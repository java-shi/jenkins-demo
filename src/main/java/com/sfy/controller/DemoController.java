package com.sfy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Sfy
 * @Date: 2020/7/1 0001 14:47
 */
@RestController
public class DemoController {


    @RequestMapping(method = RequestMethod.GET,path = "/getDemo")
    public String getDemo(){
        return "demo1222222";
    }


    @RequestMapping(method = RequestMethod.GET,path = "/getUser")
    public String getUser(){
        return "SFY";
    }
}
