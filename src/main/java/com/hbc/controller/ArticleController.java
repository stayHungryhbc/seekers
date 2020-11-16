package com.hbc.controller;

import com.hbc.domain.Article;
import com.hbc.domain.User;
import com.hbc.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    //首页的展示功能，先把所有文章都传上去再说，不过后期就需要特殊的推荐方式来展示了，这里不考虑优化，把所有数据查出来选择性传输
    @RequestMapping("/findAll")
    public List<Article> findAll(Model model){
        List<Article> articleList = articleService.findAll();
        return articleList;
    }

    //对应一篇文章的展示，目前不做优化，把所有数据查出来选择性传输
    @RequestMapping("/read")
    public Article read(Article article){
        Article bean = articleService.findByExample(article);
        return bean;
    }

    @RequestMapping("/test1/{id}/{username}")
    public void test1(@PathVariable int id,@PathVariable("username") String name){
        System.out.println("id是"+id+"名字是"+name);
    }
    @RequestMapping("/test2")
    public void test2(int id, User user){
        System.out.println("id是"+id+"名字是"+user.getUsername()+"id是"+user.getId());
    }
    @RequestMapping("/test3")
    public void test3(String[] str){}

}
