package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Created by Administrator
 * @Date 2019/12/2
 * @Time：15:31
 * @Description:
 */
@Component
public class MyCommanRunner implements CommandLineRunner {
    @Override
    public void run(String... args){
        System.out.println("芝麻开门门门门门门");
        try{
            Runtime.getRuntime().exec("cmd /c start http://localhost:8080/User/searchByName");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
