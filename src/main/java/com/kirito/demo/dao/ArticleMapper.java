package com.kirito.demo.dao;

import com.kirito.demo.entity.ArticleDO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ArticleMapper {
    @Select("SELECT * FROM article")
    List<ArticleDO> getArticles();

    @Insert("INSERT INTO article (title, content, mid, url, createtime, updatetime,modifier) " +
            "VALUES (#{title},#{content},#{mid},#{url},#{createtime},#{updatetime},#{modifier})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void addArticle(ArticleDO articleDO);

    @Update("UPDATE article SET title = #{title},content=#{content}," +
            "mid=#{mid},url=#{url},updatetime=#{updatetime}," +
            "modifier=#{modifier} WHERE id = #{id}")
    void updateArticle(ArticleDO articleDO);

    @Delete("DELETE FROM article WHERE id =#{id}")
    void deleteArticle(Integer id);
}
