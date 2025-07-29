package com.openapi3.mapper;

import com.openapi3.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author huawei
* @description 针对表【user】的数据库操作Mapper
* @createDate 2025-07-19 18:56:02
* @Entity com.openapi3.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




