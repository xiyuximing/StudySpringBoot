package com.cy.blogdemo.pojo;

import java.io.Serializable;

public class QryArticleInfo extends Article implements Serializable {

    private Integer page;

    private Integer size;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public QryArticleInfo() {
    }

    @Override
    public String toString() {
        return "QryArticleInfo{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }
}
