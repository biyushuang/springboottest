package com.jingchuang.test.ctrl;

import com.jingchuang.test.entiy.User;
import com.jingchuang.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userservice;

    @RequestMapping("/index")
    public String index(){
        List<User> users = userservice.getUsers();
        for (User u : users){
            System.out.print(u.getName());
        }
        return "index";
    }

}