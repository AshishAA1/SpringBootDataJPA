package com.datajpa.SpringBootDataJPA.repository;

import com.datajpa.SpringBootDataJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {

    public List<Student> findByFirstName(String firstname);

   public List<Student> findByFirstNameContaining(String name);

   public List<Student> findByLastNameNotNull();

   public List<Student> findByGuardianName(String name);

    public Student findByFirstNameAndLastName(String firstname, String lastname);


    // JpQl query are defined based on the classes which are present in our project
    // not based on the table names and colums
    @Query("select s from Student s where s.emaiId = ?1")
     Student getStudentByEmailAddress(String emailId);

    @Query("select s.firstName from Student s where s.emaiId = ?1")
    String getStudentFirstNameByEmailAddress(String emailId);



}
