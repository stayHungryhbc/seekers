package com.hbc.mapper;

import com.hbc.domain.News;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface NewsMapper extends Mapper<News> {

}
