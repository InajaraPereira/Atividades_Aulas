package br.com.dh.meli.desafiotutorial.repository;

import br.com.dh.meli.desafiotutorial.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

    List<Tutorial> findTutorialByPublicationStatusTrue();

    List<Tutorial> findTutorialByTitleContaining(String title);

}
