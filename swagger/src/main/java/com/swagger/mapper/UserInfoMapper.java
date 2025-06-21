package com.swagger.mapper;

import com.swagger.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author huawei
* @description 针对表【user_info】的数据库操作Mapper
* @createDate 2025-06-21 18:18:59
* @Entity com.swagger.entity.UserInfo
*/
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}




