package com.hbc.mapper;

import com.hbc.domain.Post;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface PostMapper extends Mapper<Post> {
}
