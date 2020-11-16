package com.hbc.service;

import com.hbc.domain.Answer;
import com.hbc.mapper.AnswerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    @Autowired
    private AnswerMapper answerMapper;

    public void add(Answer answer){
        answerMapper.insert(answer);
    }

    public void delete(Answer answer){
        answerMapper.delete(answer);
    }

    public void update(Answer answer){
        answerMapper.updateByPrimaryKey(answer);
    }

    public Answer find(Answer answer){
        Answer answer1 = answerMapper.selectOne(answer);
        return answer1;
    }

    public List<Answer> findAll(){
        List<Answer> answerList = answerMapper.selectAll();
        return answerList;
    }

}
