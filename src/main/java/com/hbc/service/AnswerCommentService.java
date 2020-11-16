package com.hbc.service;

import com.hbc.domain.Answer;
import com.hbc.domain.AnswerComment;
import com.hbc.mapper.AnswerCommentMapper;
import com.hbc.mapper.AnswerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerCommentService {
    @Autowired
    private AnswerCommentMapper answerCommentMapper;

    public void add(AnswerComment answerComment){
        answerCommentMapper.insert(answerComment);
    }

    public void delete(AnswerComment answerComment){
        answerCommentMapper.delete(answerComment);
    }

    public void update(AnswerComment answerComment){
        answerCommentMapper.updateByPrimaryKey(answerComment);
    }

    public AnswerComment find(AnswerComment answerComment){
        AnswerComment answerComment1 = answerCommentMapper.selectOne(answerComment);
        return answerComment1;
    }

    public List<AnswerComment> findAll(){
        List<AnswerComment> answerCommentList = answerCommentMapper.selectAll();
        return answerCommentList;
    }
}
