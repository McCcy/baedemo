package com.kirito.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class ArticleDO {
    private Integer id;
    private String title;
    private String content;
    private Integer mid;
    //    @JsonIgnore
    private Date createtime;
    @JsonIgnore
    private Date updatetime;
    @JsonIgnore
    private String modifier;
}
