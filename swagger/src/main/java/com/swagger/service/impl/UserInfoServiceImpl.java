package com.swagger.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swagger.entity.UserInfo;
import com.swagger.service.UserInfoService;
import com.swagger.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author huawei
* @description 针对表【user_info】的数据库操作Service实现
* @createDate 2025-06-21 18:18:59
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




