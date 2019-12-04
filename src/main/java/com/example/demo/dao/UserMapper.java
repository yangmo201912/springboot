package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Created by Administrator
 * @Date 2019/11/29
 * @Time：15:25
 * @Description:
 */
@Mapper     //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface  UserMapper {
    User selectUserByName(String name);
}
