package com.dongyang.backend.repository;

import com.dongyang.backend.entity.ArticleEntity;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<ArticleEntity, Long> {
}


