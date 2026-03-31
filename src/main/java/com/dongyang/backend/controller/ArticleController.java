package com.dongyang.backend.controller;

import com.dongyang.backend.dto.ArticleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @PostMapping("/articles/create")
    public String newArticleForm(ArticleDTO dto) {
        System.out.println("title : " + dto.getTitle());
        System.out.println("contents : " + dto.getContents());
        // 3. DAO 만들어서 2번 DTO 전달
        return "";
    }

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "article/new";
    }
}
