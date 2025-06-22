package com.openapi3.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.openapi3.entity.UserInfo;
import com.openapi3.service.UserInfoService;
import com.openapi3.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Tag(name = "用户模块", description = "用户相关接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/getByName")
    @Operation(
            summary = "根基用户姓名查询用户",
            description = "传入用户的姓名，返回有关的所有用户",
            // tags = "用户模块1", // 可以省略
            responses = {
                    @ApiResponse(responseCode = "200", description = "成功返回用户信息",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = Result.class))),
                    @ApiResponse(responseCode = "404", description = "用户不存在")
            }
    )
//    @Parameters()
    public Result<IPage<UserInfo>> getByName(@Parameter(name = "name", description = "用户姓名", example = "张")
                                                 @RequestParam("name") String name) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", name);
        System.out.println(name);
        IPage<UserInfo> page = new Page<>(0, 10);
        IPage<UserInfo> userList = userInfoService.page(page, queryWrapper);
        System.out.println(userList.toString());
        return Result.success(userList);
    }

}


