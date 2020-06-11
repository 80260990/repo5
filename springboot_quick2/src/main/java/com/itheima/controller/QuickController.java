package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname QuickController
 * @Description TODO
 * @Date 2020/6/9 23:33
 * @Created by Leslie
 */
@RestController
public class QuickController {

    @RequestMapping("/quick")
    public String quick(){
        return "springBoot!!!";
    }
}
