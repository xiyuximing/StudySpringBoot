package com.cy.blogdemo.dao;

import com.cy.blogdemo.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ArticleDao extends JpaRepository<Article, Integer>, PagingAndSortingRepository<Article, Integer> {
}
