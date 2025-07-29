package com.mybatis.controller;
import com.mybatis.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (mysql_review.`user`)表控制层
* @author xxxxx
*/
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;


    @RequestMapping("/total")
    public long getUserTotal(){
        return userMapper.getTotal();
    }

}
