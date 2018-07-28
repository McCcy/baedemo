package com.kirito.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ArticleDO {
    private Integer id;
    private String title;
    private String content;
    private Integer mid;
    private Date createtime;
    private Date updatetime;
}
