package com.kirito.demo.service;

import com.kirito.demo.entity.ArticleDO;

import java.util.List;

/**
 * Created by ccy
 * 2018/7/29 8:23
 */
public interface ArticleService {
    List<ArticleDO> getArticles();

    void addArticle(ArticleDO articleDO);

    void updateArticle(ArticleDO articleDO);

    void deleteArticle(Integer id);
}
