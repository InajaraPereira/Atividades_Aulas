package br.com.meli.springdata02.service;

import br.com.meli.springdata02.model.Author;
import br.com.meli.springdata02.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo repo;

    @Transactional
    public Author save(Author author){
        author.getAddress().setAuthor(author);
        return repo.save(author);
    }

}
