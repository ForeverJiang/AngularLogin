package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 * Creator: jiangyongheng
 * Date: 2019/03/21
 * Time: 11:07
 */
@Controller
public class AngularContr {
    @RequestMapping("/angular")
    public String rest() {
        return "index";
    }
}
