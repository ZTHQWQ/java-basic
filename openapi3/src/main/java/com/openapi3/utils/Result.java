package com.openapi3.utils;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 通用接口返回结果封装类
 *
 * @param <T> 返回的数据类型
 */
@Schema(name = "result类", description = "统一返回结果")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "是否成功", example = "true")
    private boolean success;

    @Schema(description = "状态码", example = "200")
    private int code;

    @Schema(description = "提示信息", example = "操作成功")
    private String message;

    @Schema(description = "返回的数据")
    private T data;

    @Schema(description = "时间戳", example = "1721543600000")
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
