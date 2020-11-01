package com.cy.blogdemo.service.impl;

import com.cy.blogdemo.dao.ArticleDao;
import com.cy.blogdemo.pojo.Article;
import com.cy.blogdemo.pojo.QryArticleInfo;
import com.cy.blogdemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public Page<Article> qryPageInfo(QryArticleInfo cond) {
        PageRequest page = PageRequest.of(cond.getPage(), cond.getSize());
        return articleDao.findAll(page);
    }
}
