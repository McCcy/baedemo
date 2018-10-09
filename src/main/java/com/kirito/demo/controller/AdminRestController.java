package com.kirito.demo.controller;

import com.kirito.demo.dto.ResultDTO;
import com.kirito.demo.entity.ArticleDO;
import com.kirito.demo.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ccy
 * 2018/7/29 11:05
 */
@RestController
@Slf4j
public class AdminRestController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/article")
    @Cacheable(cacheNames = "article1", key = "123")
    public ResultDTO getArticles() {
        ResultDTO resultDTO = new ResultDTO();
        List<ArticleDO> articles = articleService.getArticles();
        resultDTO.setCode(1000);
        resultDTO.setMessage("ok");
        resultDTO.setData(articles);
        log.info("【获取数据库的artcle】");
        return resultDTO;
    }
}
