package com.hbc.domain;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "question")
public class Question {
    @Id
    @KeySql(useGeneratedKeys = true)
    private int id;
    private String content;
    private String type;
    private Date createDate;
    private int answers;
    private int comments;
    private int goods;
    private User user;

//    public Date getCreateDate() {
//        return createDate;
//    }
//
//    public void setCreateDate(Date createDate) {
//        this.createDate = createDate;
//    }
//
//    public int getComments() {
//        return comments;
//    }
//
//    public void setComments(int comments) {
//        this.comments = comments;
//    }
//
//    public int getGoods() {
//        return goods;
//    }
//
//    public void setGoods(int goods) {
//        this.goods = goods;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public User getWriter() {
//        return user;
//    }
//
//    public void setWriter(User user) {
//        this.user = user;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public int getAnswers() {
//        return answers;
//    }
//
//    public void setAnswers(int answers) {
//        this.answers = answers;
//    }
}
