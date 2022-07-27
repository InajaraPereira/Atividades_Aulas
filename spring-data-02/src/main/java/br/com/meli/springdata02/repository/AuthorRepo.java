package br.com.meli.springdata02.repository;

import br.com.meli.springdata02.dto.AuthorDTO;
import br.com.meli.springdata02.model.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends CrudRepository<Author, Long> {
    @Query("select a from Author a where a.id = ?1")
    AuthorDTO getById(long id);

    @Query(value = "select * from author where id = ?1", nativeQuery = true)
    Author getNativeById(long id);

    @Query("select a from Author a left join fetch a.address where a.id = :id")
    AuthorDTO getDtoEagle(long id);

}
