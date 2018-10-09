package com.kirito.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ArticleDO implements Serializable {

    private static final long serialVersionUID = 1494169497961052175L;
    private Integer id;
    private String title;
    private String content;
    private Integer mid;
    private String url;
    //    @JsonIgnore
    private Date createtime;
    @JsonIgnore
    private Date updatetime;
    @JsonIgnore
    private String modifier;
}
