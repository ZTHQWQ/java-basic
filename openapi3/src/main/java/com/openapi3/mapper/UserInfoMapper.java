package com.openapi3.mapper;

import com.openapi3.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author huawei
* @description 针对表【user_info】的数据库操作Mapper
* @createDate 2025-06-21 23:45:56
* @Entity com.openapi3.entity.UserInfo
*/
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}




