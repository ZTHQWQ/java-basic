package com.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

/**
 * 通用接口返回结果封装类
 *
 * @param <T> 返回的数据类型
 */
@ApiModel(value = "Result", description = "统一返回结果")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "是否成功", example = "true")
    private boolean success;

    @ApiModelProperty(value = "状态码", example = "200")
    private int code;

    @ApiModelProperty(value = "提示信息", example = "操作成功")
    private String message;

    @ApiModelProperty(value = "返回的数据")
    private T data;

    @ApiModelProperty(value = "时间戳", example = "1721543600000")
    @Builder.Default
    private long timestamp = System.currentTimeMillis();

    // ------------------ 静态构造方法 ------------------

    public static <T> Result<T> success() {
        return Result.<T>builder()
                .success(true)
                .code(200)
                .message("操作成功")
                .build();
    }

    public static <T> Result<T> success(T data) {
        return Result.<T>builder()
                .success(true)
                .code(200)
                .message("操作成功")
                .data(data)
                .build();
    }

    public static <T> Result<T> success(String message, T data) {
        return Result.<T>builder()
                .success(true)
                .code(200)
                .message(message)
                .data(data)
                .build();
    }

    public static <T> Result<T> fail() {
        return Result.<T>builder()
                .success(false)
                .code(500)
                .message("操作失败")
                .build();
    }

    public static <T> Result<T> fail(String message) {
        return Result.<T>builder()
                .success(false)
                .code(500)
                .message(message)
                .build();
    }

    public static <T> Result<T> fail(int code, String message) {
        return Result.<T>builder()
                .success(false)
                .code(code)
                .message(message)
                .build();
    }

    public static <T> Result<T> of(boolean success, int code, String message, T data) {
        return Result.<T>builder()
                .success(success)
                .code(code)
                .message(message)
                .data(data)
                .build();
    }
}
