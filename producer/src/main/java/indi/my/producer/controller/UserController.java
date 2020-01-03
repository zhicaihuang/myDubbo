package indi.my.producer.controller;

import indi.my.producer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public String userInfo(){
        return userService.getUser();
    }
}
