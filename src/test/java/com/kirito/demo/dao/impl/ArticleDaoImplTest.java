package com.kirito.demo.dao.impl;

import com.kirito.demo.dao.ArticleDao;
import com.kirito.demo.entity.ArticleDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by ccy
 * 2018/7/29 8:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ArticleDaoImplTest {

    @Autowired
    private ArticleDao articleDao;

    @Test
    public void getArticles() {
        List<ArticleDO> list = articleDao.getArticles();
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void addArticle() {
        ArticleDO articleDO = new ArticleDO();
        articleDO.setContent("xxxxxx");
        articleDO.setMid(1);
        articleDO.setTitle("test");
        articleDO.setModifier("ccy");
        articleDO.setCreatetime(new Date());
        log.info("【articleDO 的值为】：" + articleDO.toString());
        articleDao.addArticle(articleDO);
    }

    @Test
    public void updateArticle() {
        ArticleDO articleDO = new ArticleDO();
        articleDO.setId(1);
        articleDO.setContent("AAA");
        articleDO.setMid(2);
        articleDO.setTitle("test1");
        articleDO.setModifier("ccy");
        articleDO.setUpdatetime(new Date());
        log.info("【articleDO 的值为】：" + articleDO.toString());
        articleDao.updateArticle(articleDO);
    }

    @Test
    public void deleteArticle() {
        articleDao.deleteArticle(2);
    }
}