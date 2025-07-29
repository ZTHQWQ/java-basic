package com.openapi3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.openapi3.entity.User;
import com.openapi3.service.UserService;
import com.openapi3.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author huawei
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-07-19 18:56:02
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




