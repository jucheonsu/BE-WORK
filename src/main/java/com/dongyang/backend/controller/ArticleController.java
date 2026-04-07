package com.dongyang.backend.controller;

import com.dongyang.backend.dto.ArticleDTO;
import com.dongyang.backend.entity.ArticleEntity;
import com.dongyang.backend.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @PostMapping("/articles/create")
    public String newArticleForm(ArticleDTO dto) {
        // 1. dto 값을 ArticleEntity의 객체 생성해서 값을 넣어줌
        // ArticleEntity an = new ArticleEntity(null, dto.getTitle(), dto.getContents());
        ArticleEntity an = dto.toEntity();
        // 2. ArticleRepository 객체 생성 후 save (1번 경과) 호출
        articleRepository.save(an);

        System.out.println("title : " + dto.getTitle() + "  content : " + dto.getContents());
        return "articles/create";
    }

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "article/new";
    }

    @GetMapping("/articles/{id}")
    public String show(@PathVariable("id") Long id) {
        System.out.println("path value : " + id);
        return "article/show";
    }
}
