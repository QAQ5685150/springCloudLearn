package com.linxx.springcloud.entity;

import lombok.Data;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-11 21:47
 * @Description: 通用返回对象
 * @Project_name: cloudLearn
 */
@Data
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}

