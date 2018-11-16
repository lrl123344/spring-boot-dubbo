package com.example.consumer.Controller;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;
import service.impl.UserServiceImpl;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/save")
    public String saveUser(){
        User user=new User();
        user.setUserName("liuruilin");
        user.setPassword("123456");
       @NonNull User u= userService.saveUser(user);

        System.err.println("远程调用返回的参数: "+u.getTitle());
        System.err.println("远程调用返回的参数: "+u.getAuthor());

        return "我跳用成功了？";
    }


}
