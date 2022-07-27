package br.com.meli.springelastic.service;

import br.com.meli.springelastic.model.Article;
import br.com.meli.springelastic.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements IArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article save(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article findById(int id) {
        return articleRepository.findById(id).get();
    }

    @Override
    public String deleteById(int id) {
        articleRepository.deleteById(id);
        return "Artigo removido com sucesso!";
    }

    @Override
    public List<Article> findAll() {
//        List<Article> listArticlos = new ArrayList<>();
//        Iterable<Article> listIterabloArticlos = articleRepository.findAll();
//        listIterabloArticlos.forEach(article -> {
//            listArticlos.add(article);
//        });
//        return listArticlos;
        return articleRepository.findAllArticles();
    }

    @Override
    public Article update(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article findArticleByTitle(String title) {
        return articleRepository.findArticleByTitle(title);
    }

    @Override
    public Page<Article> getArticleByTitle(String title, Pageable pg) {
        return articleRepository.getArticleByTitle(title, pg);
    }

}
