package com.kirito.demo.service.impl;

import com.kirito.demo.dao.ArticleDao;
import com.kirito.demo.entity.ArticleDO;
import com.kirito.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ccy
 * 2018/7/29 8:25
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<ArticleDO> getArticles() {
        return articleDao.getArticles();
    }

    @Override
    public void addArticle(ArticleDO articleDO) {
        articleDao.addArticle(articleDO);
    }

    @Override
    public void updateArticle(ArticleDO articleDO) {
        articleDao.updateArticle(articleDO);
    }

    @Override
    public void deleteArticle(Integer id) {
        articleDao.deleteArticle(id);
    }
}
