package com.hbc.domain;


import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "article")
public class Article {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    private String title;
    private String summary;
    private String writer;
    private String type;
    private String hyperlink;
    private String mainPicture;
    private Date createDate;
    private Integer goods;
    private Integer comments;

    @Transient
    private String content;
    @Transient
    private List<ArticleComment> articleComments;

//    public Date getCreateDate() {
//        return createDate;
//    }
//
//    public void setCreateDate(Date createDate) {
//        this.createDate = createDate;
//    }
//
//    public String getMainPicture() {
//        return mainPicture;
//    }
//
//    public void setMainPicture(String mainPicture) {
//        this.mainPicture = mainPicture;
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
//
//    public String getWriter() {
//        return writer;
//    }
//
//    public void setWriter(String writer) {
//        this.writer = writer;
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
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getHyperlink() {
//        return hyperlink;
//    }
//
//    public void setHyperlink(String hyperlink) {
//        this.hyperlink = hyperlink;
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
//    public String getSummary() {
//        return summary;
//    }
//
//    public void setSummary(String summary) {
//        this.summary = summary;
//    }
}
