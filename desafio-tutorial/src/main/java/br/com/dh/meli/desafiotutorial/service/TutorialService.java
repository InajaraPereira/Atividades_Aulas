package br.com.dh.meli.desafiotutorial.service;

import br.com.dh.meli.desafiotutorial.dto.TutorialDto;
import br.com.dh.meli.desafiotutorial.model.Tutorial;

import java.util.List;

public interface TutorialService {

    Tutorial save(TutorialDto tutorial);

    List<Tutorial> findAll();

    Tutorial findById(Long id);

    void deleteAll();

    void deleteById(Long id);

    List<Tutorial> findTutorialByPublicationStatusTrue();

    List<Tutorial> findTutorialByTitleContaining(String title);

    Tutorial updateById(Long id, TutorialDto tutorial);

}
