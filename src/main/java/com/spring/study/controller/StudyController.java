package com.spring.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/5/22.
 */
@Controller
public class StudyController {

    @RequestMapping("study")
    public void study(String name){
        System.out.println(name);
    }
}
