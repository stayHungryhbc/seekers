package com.hbc.service;

import com.hbc.domain.Article;
import com.hbc.domain.ArticleComment;
import com.hbc.mapper.ArticleCommentMapper;
import com.hbc.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ArticleCommentMapper articleCommentMapper;

    public List<Article> findAll(){
        List<Article> articleList = articleMapper.selectAll();
        for (Article article : articleList) {
            ArticleComment temp = new ArticleComment();
            temp.setAid(article.getId());
            List<ArticleComment> articleCommentList = articleCommentMapper.select(temp);
            article.setArticleComments(articleCommentList);
        }
        return articleList;
    }

    public Article findByExample(Article article){
        Article bean = articleMapper.selectByPrimaryKey(article.getId());
        return bean;
    }
}
