package com.cy.blogdemo.service;

import com.cy.blogdemo.pojo.Article;
import com.cy.blogdemo.pojo.QryArticleInfo;
import org.springframework.data.domain.Page;

public interface ArticleService {
    /**
     * 根据条件查询分页信息
     * @param cond 查询条件
     * @return
     */
    Page<Article> qryPageInfo(QryArticleInfo cond);
}
