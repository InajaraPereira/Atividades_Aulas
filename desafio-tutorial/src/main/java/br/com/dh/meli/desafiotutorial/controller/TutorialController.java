package br.com.dh.meli.desafiotutorial.controller;

import br.com.dh.meli.desafiotutorial.dto.TutorialDto;
import br.com.dh.meli.desafiotutorial.model.Tutorial;
import br.com.dh.meli.desafiotutorial.service.TutorialServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tutorials")
public class TutorialController {

    @Autowired
    private TutorialServiceImp tutorialService;

    @PostMapping
    public ResponseEntity<Tutorial> save(@RequestBody TutorialDto tutorial) {
        return ResponseEntity.status(HttpStatus.CREATED).body(tutorialService.save(tutorial));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Tutorial>> findAll() {
        return ResponseEntity.ok(tutorialService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tutorial> findById(@PathVariable Long id) {
        return ResponseEntity.ok(tutorialService.findById(id));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAll() {
        tutorialService.deleteAll();
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        tutorialService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/published")
    public ResponseEntity<List<Tutorial>> findTutorialByPublicationStatusTrue() {
        return ResponseEntity.ok(tutorialService.findTutorialByPublicationStatusTrue());
    }

    @GetMapping
    public ResponseEntity<List<Tutorial>> findTutorialByTitleContaining(@RequestParam String title) {
        return ResponseEntity.ok(tutorialService.findTutorialByTitleContaining(title));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tutorial> updateById(@PathVariable Long id, @RequestBody TutorialDto tutorial) {
        return ResponseEntity.ok(tutorialService.updateById(id, tutorial));
    }

}
