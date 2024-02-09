package com.datajpa.SpringBootDataJPA.repository;

import com.datajpa.SpringBootDataJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {

    public List<Student> findByFirstName(String firstname);

   public List<Student> findByFirstNameContaining(String name);

   public List<Student> findByLastNameNotNull();

   public List<Student> findByGuardianName(String name);

    public Student findByFirstNameAndLastName(String firstname, String lastname);
}
