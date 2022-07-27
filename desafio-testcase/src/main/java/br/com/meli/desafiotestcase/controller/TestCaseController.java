package br.com.meli.desafiotestcase.controller;

import br.com.meli.desafiotestcase.model.TestCase;
import br.com.meli.desafiotestcase.service.TesteCaseService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public TestCase save(@RequestBody TestCase testCase) {
        return testeCaseService.save(testCase);
    }

    @GetMapping
    public List<TestCase> findAll() {
        return testeCaseService.findAll();
    }

    @GetMapping("/{id}")
    public TestCase findById(@PathVariable Long id) {
        return testeCaseService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        testeCaseService.deleteBydId(id);
    }

    @GetMapping("/date/{date}")
    public List<TestCase> findTestCaseByLastUpdateAfter(@PathVariable String date) {
        return testeCaseService.findTestCaseByLastUpdateAfter(LocalDate.parse(date));
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
