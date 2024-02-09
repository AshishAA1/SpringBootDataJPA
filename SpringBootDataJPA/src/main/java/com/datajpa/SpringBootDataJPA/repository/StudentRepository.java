package com.datajpa.SpringBootDataJPA.repository;

import com.datajpa.SpringBootDataJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {




}
