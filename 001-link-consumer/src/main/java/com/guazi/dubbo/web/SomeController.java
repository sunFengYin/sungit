package com.guazi.dubbo.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.guazi.dubbo.model.User;
import com.guazi.dubbo.service.SomeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller
public class SomeController {
    @Autowired
    private SomeService someService;

    @RequestMapping(value = "/hello")
    public String hello(Model model){
        String hello=someService.hello();
        model.addAttribute("hello");
        return "hello";
    }

    @RequestMapping(value = "/user/detail")
    public String userDetail(Model model,Integer id){
        User user = someService.queryUserByID(id);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
