package com.meli.obterdiploma.repository;

import com.meli.obterdiploma.exception.StudentNotFoundException;
import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.util.TestUtilsGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;

class StudentDAOTest {

    private static IStudentDAO studentDAO;

    @BeforeEach
    void setTup() {
        studentDAO = new StudentDAO();
        TestUtilsGenerator.emptyUsersFile();
    }

    @AfterAll
    public static void tearDown() {
        TestUtilsGenerator.emptyUsersFile();
    }

    @Test
    void save_saveStudent_whenNewStudent() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDTO savedStudent = studentDAO.save(newStudent);
        Assertions.assertThat(savedStudent).isNotNull();
        Assertions.assertThat(savedStudent.getId().doubleValue()).isPositive();
        Assertions.assertThat(savedStudent.getStudentName()).isEqualTo(newStudent.getStudentName());
    }

    @Test
    void save_updateStudent_whenNewStudentWithId() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDTO savedStudent = studentDAO.save(newStudent);
        savedStudent.setStudentName("Novo nome");
        savedStudent.getSubjects().get(0).setName("Outra disciplina");
        StudentDTO updateStudent = studentDAO.save(savedStudent);
        Assertions.assertThat(updateStudent).isNotNull();
        Assertions.assertThat(updateStudent.getId()).isEqualTo(savedStudent.getId());
        Assertions.assertThat(updateStudent.getStudentName()).isEqualTo(savedStudent.getStudentName());
        Assertions.assertThat(updateStudent.getSubjects().get(0).getName())
                .isEqualTo(savedStudent.getSubjects().get(0).getName());
    }

    @Test
    void save_throwException_whenStudentWithIdNotExist() {
        StudentDTO student = TestUtilsGenerator.getStudentWithId();
        StudentNotFoundException exception = assertThrows(StudentNotFoundException.class, () -> {
            StudentDTO savedStudent = studentDAO.save(student);
        });
        Assertions.assertThat(exception.getError().getDescription()).contains(student.getId().toString());
        Assertions.assertThat(exception.getStatus()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    void delete() {
    }

    @Test
    void exists_returnFalse_whenStudentNotExist() {
        StudentDTO student = TestUtilsGenerator.getStudentWithId();
        boolean found = studentDAO.exists(student);
        Assertions.assertThat(found).isFalse();
    }

    @Test
    void findById_retunrStudent_whenStudentExist() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDTO savedStudent = studentDAO.save(newStudent);
        StudentDTO foundStudent = studentDAO.findById(savedStudent.getId());
        assertNotNull(foundStudent);
        Assertions.assertThat(foundStudent.getId()).isEqualTo(savedStudent.getId());
        Assertions.assertThat(foundStudent.getStudentName()).isEqualTo(savedStudent.getStudentName());
    }

    @Test
    void findById_throwException_whenIdNotExistStudent() {
        StudentDTO student = TestUtilsGenerator.getStudentWithId();
        StudentNotFoundException exception = assertThrows(StudentNotFoundException.class, () -> {
            StudentDTO savedStudent = studentDAO.findById(student.getId());
        });
        Assertions.assertThat(exception.getError().getDescription()).contains(student.getId().toString());
        Assertions.assertThat(exception.getStatus()).isEqualTo(HttpStatus.NOT_FOUND);
    }
}