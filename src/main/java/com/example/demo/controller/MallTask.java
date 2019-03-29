package com.example.demo.controller;

import com.example.demo.model.Hero;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 静态资源访问
 * Creator: jiangyongheng
 * Date: 2019/03/22
 * Time: 15:22
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MallTask {
    Hero hero;

    public MallTask(){
        hero = new Hero();
    }

    @RequestMapping(value = "/hero" , method = RequestMethod.GET)
    public Hero heroCon(){
        hero.setHeroesUrl("123");
        hero.setTextfile("1234");
        return hero;
    }
}
