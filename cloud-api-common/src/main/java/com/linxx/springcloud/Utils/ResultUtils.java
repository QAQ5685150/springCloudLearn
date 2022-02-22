package com.linxx.springcloud.Utils;

import com.linxx.springcloud.Common.result;
import com.linxx.springcloud.entity.CommonResult;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-11 22:05
 * @Description: TODO
 * @Project_name: cloudLearn
 */
public class ResultUtils {

    public static<T> CommonResult<T> success(T data){
        return new CommonResult<T>(result.SUCCESS_CODE,result.SUCCESS_MESSAGE,data);
    }
}
