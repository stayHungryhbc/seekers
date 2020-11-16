package com.hbc.domain;


import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "user")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String username;
    private String password;
    private String summary;
    private String headPicture;
    private Integer questions;
    private Integer answers;
    private Integer tests;
    private Integer solutions;
    private Integer posts;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return username;
//    }
//
//    public void setName(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getSummary() {
//        return summary;
//    }
//
//    public void setSummary(String summary) {
//        this.summary = summary;
//    }
//
//    public String getHeadPicture() {
//        return headPicture;
//    }
//
//    public void setHeadPicture(String headPicture) {
//        this.headPicture = headPicture;
//    }
//
//    public int getQuestions() {
//        return questions;
//    }
//
//    public void setQuestions(int questions) {
//        this.questions = questions;
//    }
//
//    public int getAnswers() {
//        return answers;
//    }
//
//    public void setAnswers(int answers) {
//        this.answers = answers;
//    }
//
//    public int getTests() {
//        return tests;
//    }
//
//    public void setTests(int tests) {
//        this.tests = tests;
//    }
//
//    public int getSolutions() {
//        return solutions;
//    }
//
//    public void setSolutions(int solutions) {
//        this.solutions = solutions;
//    }
//
//    public int getPosts() {
//        return posts;
//    }
//
//    public void setPosts(int posts) {
//        this.posts = posts;
//    }
}
