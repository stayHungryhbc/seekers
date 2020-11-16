package com.hbc.service;

import com.hbc.domain.News;
import com.hbc.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsMapper newsMapper;

    //返回最近一周的新闻（热度排序怎么整？相关性排序？）
    public List<News> hotNews(){
        List<News> newsList = newsMapper.selectAll();
        return newsList;
    }
}
