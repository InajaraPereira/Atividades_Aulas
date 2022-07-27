package br.com.meli.springelastic.controller;

import br.com.meli.springelastic.model.Article;
import br.com.meli.springelastic.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public ResponseEntity<Article> save(@RequestBody Article article) {
        return ResponseEntity.ok(articleService.save(article));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> findById(@PathVariable int id) {
        return ResponseEntity.ok(articleService.findById(id));
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<Article> findArticleByTitle(@PathVariable String title) {
        return ResponseEntity.ok(articleService.findArticleByTitle(title));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id) {
        return ResponseEntity.ok(articleService.deleteById(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteVoidById(@PathVariable int id) {
        articleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Article>> findAll() {
        return ResponseEntity.ok(articleService.findAll());
    }

    @PutMapping
    public ResponseEntity<Article> update(@RequestBody Article article) {
        return ResponseEntity.ok(articleService.update(article));
    }

    @GetMapping("/titlepage/{title}")
    public ResponseEntity<Page<Article>> getArticleByTitle(@PathVariable String title, Pageable pg) {
        return ResponseEntity.ok(articleService.getArticleByTitle(title, pg));
    }

}
