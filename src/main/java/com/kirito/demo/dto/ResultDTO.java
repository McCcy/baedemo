package com.kirito.demo.dto;

import lombok.Data;

/**
 * Created by ccy
 * 2018/7/29 11:06
 */
@Data
public class ResultDTO<T> {
    public Integer code;
    public String message;
    public T data;
}
