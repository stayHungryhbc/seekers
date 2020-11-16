package com.hbc.mapper;

import com.hbc.domain.Question;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface QuestionMapper extends Mapper<Question> {

}
