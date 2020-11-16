package com.hbc.domain;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data
@Table(name = "solutionComment")
public class SolutionComment {
    @Id
    @KeySql(useGeneratedKeys = true)
    private int id;
    private String content;
    private Date createDate;
    private User user;
    private Solution solution;

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
//    public Date getCreateDate() {
//        return createDate;
//    }
//
//    public void setCreateDate(Date createDate) {
//        this.createDate = createDate;
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
//    public Solution getSolution() {
//        return solution;
//    }
//
//    public void setSolution(Solution solution) {
//        this.solution = solution;
//    }
}
