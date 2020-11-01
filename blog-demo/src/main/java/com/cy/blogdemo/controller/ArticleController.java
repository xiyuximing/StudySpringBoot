package com.cy.blogdemo.controller;

import com.cy.blogdemo.pojo.QryArticleInfo;
import com.cy.blogdemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/index")
    public String index(Model model) {
        QryArticleInfo info = new QryArticleInfo();
        info.setPage(0);
        info.setSize(2);
        model.addAttribute("articles",  articleService.qryPageInfo(info));
        return "client/index";
    }

    @RequestMapping("/qryPageInfo")
    public String qryPageInfo(QryArticleInfo cond, Model model) {
        model.addAttribute("articles",  articleService.qryPageInfo(cond));
        return "client/index";
    }
}
