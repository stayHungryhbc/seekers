package com.hbc.domain;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 对标搜题功能中的一个问题，暂时先不用管拍照搜题的事
 */

@Data
@Table(name = "test")
public class Test {
    @Id
    @KeySql(useGeneratedKeys = true)
    private int id;
    private String content;
    private String type;
    private Date createDate;
    private int goods;
    private int solutions;
    private User user;

//    public Date getCreateDate() {
//        return createDate;
//    }
//
//    public void setCreateDate(Date createDate) {
//        this.createDate = createDate;
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
//    public int getSolutions() {
//        return solutions;
//    }
//
//    public void setSolutions(int solutions) {
//        this.solutions = solutions;
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
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
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
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
}
