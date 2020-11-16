package com.hbc.controller;

import com.hbc.domain.News;
import com.hbc.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class NewsController {
    @Autowired
    private NewsMapper newsMapper;

    @RequestMapping("/allNews")
    public List<News> getAllNews(){
        List<News> newsList = newsMapper.selectAll();
        return newsList;
    }

    @RequestMapping("/recentNews")
    public List<News> getRecentNews(){
        List<News> newsList = newsMapper.selectAll();
        return newsList;
    }
}
