package com.kirito.demo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by ccy
 * 2018/7/29 11:06
 */
@Data
public class ResultDTO<T> implements Serializable {
    private static final long serialVersionUID = 1929363318174279462L;
    public Integer code;
    public String message;
    public T data;
}
