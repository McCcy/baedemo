package com.kirito.demo.dao.impl;

import com.kirito.demo.dao.ArticleDao;
import com.kirito.demo.dao.ArticleMapper;
import com.kirito.demo.entity.ArticleDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ccy
 * 2018/7/29 8:19
 */
@Repository
public class ArticleDaoImpl implements ArticleDao {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<ArticleDO> getArticles() {
        return articleMapper.getArticles();
    }

    @Override
    public void addArticle(ArticleDO articleDO) {
        articleMapper.addArticle(articleDO);
    }

    @Override
    public void updateArticle(ArticleDO articleDO) {
        articleMapper.updateArticle(articleDO);
    }

    @Override
    public void deleteArticle(Integer id) {
        articleMapper.deleteArticle(id);
    }
}
