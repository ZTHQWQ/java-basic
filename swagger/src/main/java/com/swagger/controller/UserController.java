package com.swagger.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swagger.entity.UserInfo;
import com.swagger.service.UserInfoService;
import com.swagger.util.Result;
import io.swagger.annotations.*;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@Api(value = "用户管理", tags = "用户相关的接口")
public class UserController {

    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/getById")
    @ApiOperation(value = "查询用户", notes = "根据id查询用户")
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 404, message = "找不到资源")
    })
    @ApiResponse(code = 403, message = "没有权限")
    public Result<UserInfo> findById(@ApiParam(name = "id", value = "用户的id") Integer id ){

        QueryWrapper<UserInfo> queryWrapper =  new QueryWrapper<>();
        queryWrapper.eq("id", id);
        return Result.success(userInfoService.getOne(queryWrapper));
    }


    @GetMapping("/getByNameAndIphone")
    @ApiOperation(value = "查询用户", notes = "根据姓名和iphone查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户姓名"),
            @ApiImplicitParam(name = "iphone", value = "用户号码")}
    )
    public Result<UserInfo> findNameAndIphone(String name, String iphone){

        QueryWrapper<UserInfo> queryWrapper =  new QueryWrapper<>();
        if (StringUtils.hasText(name)) {
            queryWrapper.like("name", name);
        }
        if (StringUtils.hasText(iphone)) {
            queryWrapper.like("iphone", iphone);
        }
        try {
            UserInfo userInfo = userInfoService.getOne(queryWrapper);
            return Result.success(userInfo);
        } catch (Exception e) {
            return Result.success("不存在此用户", null);
        }
    }
}
