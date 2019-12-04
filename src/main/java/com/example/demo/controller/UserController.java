package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created by Administrator
 * @Date 2019/11/29
 * @Time：15:21
 * @Description:
 */
@RestController
@RequestMapping("/User")
 public class UserController {
    //依赖注入
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/searchByName")
    public User cs() {
        //调用dao层
        User user = userMapper.selectUserByName("yang");
        return user;
    }
}
