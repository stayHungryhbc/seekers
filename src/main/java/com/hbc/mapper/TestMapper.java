package com.hbc.mapper;

import com.hbc.domain.Test;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface TestMapper extends Mapper<Test> {
}
