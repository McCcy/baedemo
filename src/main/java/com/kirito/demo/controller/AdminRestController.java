package com.kirito.demo.controller;

import com.kirito.demo.dto.ResultDTO;
import com.kirito.demo.entity.ArticleDO;
import com.kirito.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ccy
 * 2018/7/29 11:05
 */
@RestController
public class AdminRestController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/article")
    public ResultDTO getArticles() {
        ResultDTO resultDTO = new ResultDTO();
        List<ArticleDO> articles = articleService.getArticles();
        resultDTO.setCode(1000);
        resultDTO.setMessage("ok");
        resultDTO.setData(articles);
        return resultDTO;
    }
}
