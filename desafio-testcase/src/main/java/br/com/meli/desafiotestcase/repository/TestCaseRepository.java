package br.com.meli.desafiotestcase.repository;

import br.com.meli.desafiotestcase.model.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TestCaseRepository extends JpaRepository<TestCase, Long> {

    List<TestCase> findTestCaseByLastUpdateAfter(LocalDate date);

}
