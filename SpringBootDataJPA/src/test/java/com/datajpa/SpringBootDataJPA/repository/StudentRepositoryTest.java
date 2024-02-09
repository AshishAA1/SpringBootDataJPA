package com.datajpa.SpringBootDataJPA.repository;

import com.datajpa.SpringBootDataJPA.entity.Guardian;
import com.datajpa.SpringBootDataJPA.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder().emaiId("1@gmail.com").
                firstName("ashish").lastName("adkeshwar").build();
        // guardianName("Sheshi")
        //  .guardianEmail("sheshi@gmail.com").
        // guardianMobile("9890519511").build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {

        List<Student> studentList = studentRepository.findAll();

        System.out.println("studentList =" + studentList);
    }

    @Test
    public void saveStudentsWithGuardians() {

        Guardian guardian = Guardian.builder().name("Manikantha").email("manikantha@gmial.com").mobile("9284556547").build();

        Student student = Student.builder().firstName("Ashish1").lastName("Adkeshwar").emaiId("ashish12@gmail.com").guardian(guardian).build();


        studentRepository.save(student);
    }

    @Test
    public void printStudentByFirstName() {

        List<Student> students = studentRepository.findByFirstName("Ashish1");

        System.out.println("students = " + students);
    }

    @Test
    public void pringStudentByFirstNameContaining() {

        List<Student> students = studentRepository.findByFirstNameContaining("ash");

        System.out.println("students = " + students);
    }

    @Test
    public void printStudentByGuardianName() {

        List<Student> students = studentRepository.findByGuardianName("Sheshi");

        System.out.println("students = " + students);
    }

    @Test
    public void printStudentByFirstNameAndLastName() {

        Student student = studentRepository.findByFirstNameAndLastName("Ashish1", "Adkeshwar");

        System.out.println("student = " + student);

    }

    @Test
    public void printStudentByEmailJPQL(){
        
        Student student = studentRepository.getStudentByEmailAddress("1@gmail.com");

        System.out.println("student = " + student);
    }

    @Test
    public void printFirstNameByEmaiId(){
        String firstName = studentRepository.getStudentFirstNameByEmailAddress("1@gmail.com");

        System.out.println("firstName = " + firstName);
    }
    @Test
    public void printStudentEmaiIdNative(){
        Student student = studentRepository.getStudentByEmailAddressNative("1@gmail.com");

        System.out.println("firstName = " + student);
    }

    @Test
    public void printStudentByEmailAddressNativeNamedParam(){

        Student student = studentRepository.getStudentByEmailAddressNativeNamedParam("1@gmail.com");

        System.out.println("student = " + student);
    }




}