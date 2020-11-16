package com.hbc.mapper;

import com.hbc.domain.Notice;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface NoticeMapper extends Mapper<Notice> {
}
