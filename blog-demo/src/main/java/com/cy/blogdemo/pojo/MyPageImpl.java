package com.cy.blogdemo.pojo;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class MyPageImpl<T> implements Serializable {

    private List<T> content;

    private Long total;

    private Pageable pageable;

    private Integer totalPages;

    private boolean first;

    private boolean last;

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Pageable getPageable() {
        return pageable;
    }

    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public MyPageImpl() {
    }

    public MyPageImpl(List<T> content, Pageable pageable, Integer totalPages, boolean first, boolean last) {
        this.content = content;
        this.pageable = pageable;
        this.totalPages = totalPages;
        this.first = first;
        this.last = last;
    }
}
