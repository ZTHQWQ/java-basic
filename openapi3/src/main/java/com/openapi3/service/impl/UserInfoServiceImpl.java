package com.openapi3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.openapi3.entity.UserInfo;
import com.openapi3.service.UserInfoService;
import com.openapi3.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author huawei
* @description 针对表【user_info】的数据库操作Service实现
* @createDate 2025-06-21 23:45:56
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{


}




