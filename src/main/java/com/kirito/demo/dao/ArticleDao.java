package com.kirito.demo.dao;

import com.kirito.demo.entity.ArticleDO;

import java.util.List;

public interface ArticleDao {
    List<ArticleDO> getArticles();

    void addArticle(ArticleDO articleDO);

    void updateArticle(ArticleDO articleDO);

    void deleteArticle(Integer id);
}
