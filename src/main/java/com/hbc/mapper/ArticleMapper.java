package com.hbc.mapper;

import com.hbc.domain.Article;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface ArticleMapper extends Mapper<Article> {
}
