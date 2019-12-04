package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Table;

/**
 * @Created by Administrator
 * @Date 2019/11/29
 * @Time：15:25
 * @Description:
 */
@Data
@Table(name="user")
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String email;
    private String nickName;
    private String regTime;
}
