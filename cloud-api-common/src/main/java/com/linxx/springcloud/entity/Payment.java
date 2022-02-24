package com.linxx.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-11 21:32
 * @Description: 订单属性
 * @Project_name: cloudLearn
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}