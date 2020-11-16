package com.hbc.service;

import com.hbc.domain.User;
import com.hbc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void add(User user){
        userMapper.insert(user);
    }

    public void delete(User user){
        userMapper.delete(user);
    }

    public void update(User user){
        userMapper.updateByPrimaryKey(user);
    }

    public List<User> findAll(){
        return userMapper.selectAll();
    }

    //登录使用
    public User find(User user){
        return userMapper.selectOne(user);
    }

    //注册使用
    public boolean nameExists(User user){
        List<User> userList = userMapper.select(user);
        if(!userList.isEmpty()){
            return true;
        }else {
            return false;
        }
    }




}
