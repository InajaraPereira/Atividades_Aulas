package br.com.meli.springelastic.service;

import br.com.meli.springelastic.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IArticleService {

    Article save(Article article);

    Article findById(int id);

    String deleteById(int id);

    List<Article> findAll();

    Article update(Article article);

    Article findArticleByTitle(String title);

    Page<Article> getArticleByTitle(String title, Pageable pg);

}
