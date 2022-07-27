package br.com.meli.desafiotestcase.service;

import br.com.meli.desafiotestcase.model.TestCase;
import br.com.meli.desafiotestcase.repository.TestCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TesteCaseService implements ITestCaseService {

    @Autowired
    private TestCaseRepository testCaseRepository;


    @Override
    public TestCase save(TestCase testCase) {
        return testCaseRepository.save(testCase);
    }

    @Override
    public List<TestCase> findAll() {
        return testCaseRepository.findAll();
    }

    @Override
    public TestCase findById(Long id) {
        return testCaseRepository.findById(id).get();
    }

    @Override
    public void deleteBydId(long id) {
        testCaseRepository.deleteById(id);
    }

    @Override
    public List<TestCase> findTestCaseByLastUpdateAfter(LocalDate date) {
        return testCaseRepository.findTestCaseByLastUpdateAfter(date);
    }

    @Override
    public TestCase update(TestCase testCase) {
        return save(testCase);
    }

    @Override
    public TestCase updateParcial(TestCase testCase) {
        testCaseRepository.findById(testCase.getId()).ifPresent(
                testCaseRetornado -> {
                    testCaseRetornado.setDescription(testCase.getDescription());
                    testCaseRetornado.setTested(testCase.isTested());
                    testCaseRetornado.setPassed(testCase.isPassed());
                    testCaseRetornado.setNumberOfTries(testCase.getNumberOfTries());
                    testCaseRetornado.setLastUpdate(testCase.getLastUpdate());
                }
        );
        return save(testCase);
    }

}
