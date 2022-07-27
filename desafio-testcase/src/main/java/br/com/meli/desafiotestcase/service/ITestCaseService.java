package br.com.meli.desafiotestcase.service;

import br.com.meli.desafiotestcase.model.TestCase;

import java.time.LocalDate;
import java.util.List;

public interface ITestCaseService {

    TestCase save(TestCase testCase);

    List<TestCase> findAll();

    TestCase findById(Long id) throws Exception;

    void deleteBydId(long id);

    List<TestCase> findTestCaseByLastUpdateAfter(LocalDate date);

    TestCase updateParcial(TestCase testCase);

    TestCase update(TestCase testCase);

}
