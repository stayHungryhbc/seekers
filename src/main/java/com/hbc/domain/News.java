package com.hbc.domain;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "news")
public class News {
    @Id
    @KeySql(useGeneratedKeys = true)
    private int id;
    private String content;
    private Date date;

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
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(java.sql.Date date) {
//        this.date = date;
//    }
}
