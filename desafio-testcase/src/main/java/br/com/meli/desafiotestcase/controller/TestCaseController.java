package br.com.meli.desafiotestcase.controller;

import br.com.meli.desafiotestcase.model.TestCase;
import br.com.meli.desafiotestcase.service.TesteCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/testcases")
public class TestCaseController {

    @Autowired
    private TesteCaseService testeCaseService;

    @PostMapping("/new")
    public ResponseEntity<TestCase> save(@RequestBody TestCase testCase) {
        return ResponseEntity.status(HttpStatus.CREATED).body(testeCaseService.save(testCase));
    }

    @GetMapping
    public ResponseEntity<List<TestCase>> findAll() {
        return ResponseEntity.ok(testeCaseService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestCase> findById(@PathVariable Long id) {
        return ResponseEntity.ok(testeCaseService.findById(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        testeCaseService.deleteBydId(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/date/{date}")
    public ResponseEntity<List<TestCase>> findTestCaseByLastUpdateAfter(@PathVariable String date) {
        return ResponseEntity.ok(testeCaseService.findTestCaseByLastUpdateAfter(LocalDate.parse(date)));
    }

    @PutMapping("/update")
    public ResponseEntity<TestCase> update(@RequestBody TestCase testCase) {
        return ResponseEntity.ok(testeCaseService.update(testCase));
    }

    @PatchMapping("/updateparcial")
    public ResponseEntity<TestCase> updateParcial(@RequestBody TestCase testCase) {
        return ResponseEntity.ok(testeCaseService.updateParcial(testCase));
    }

}
