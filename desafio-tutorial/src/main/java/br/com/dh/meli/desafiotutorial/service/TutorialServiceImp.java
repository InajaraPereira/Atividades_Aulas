package br.com.dh.meli.desafiotutorial.service;

import br.com.dh.meli.desafiotutorial.model.Tutorial;
import br.com.dh.meli.desafiotutorial.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialServiceImp implements TutorialService {

    @Autowired
    private TutorialRepository tutorialRepository;

    @Override
    public Tutorial save(Tutorial tutorial) {
        return tutorialRepository.save(tutorial);
    }

    @Override
    public List<Tutorial> findAll() {
        return tutorialRepository.findAll();
    }

    @Override
    public Tutorial findById(Long id) {
        return tutorialRepository.findById(id).get();
    }


    @Override
    public void deleteAll() {
        tutorialRepository.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        tutorialRepository.deleteById(id);
    }

    @Override
    public List<Tutorial> findTutorialByPublicationStatusTrue() {
        return tutorialRepository.findTutorialByPublicationStatusTrue();
    }

    @Override
    public List<Tutorial> findTutorialByTitleContaining(String title) {
        return tutorialRepository.findTutorialByTitleContaining(title);
    }

    @Override
    public Tutorial updateById(Long id, Tutorial tutorial) {
        Tutorial tutorialFound = findById(id);
        tutorialFound.setTitle(tutorial.getTitle());
        tutorialFound.setDescription(tutorial.getDescription());
        tutorialFound.setPublicationStatus(tutorial.getPublicationStatus());
        return tutorialRepository.save(tutorialFound);
    }
}
