package com.datajpa.SpringBootDataJPA.repository;

import com.datajpa.SpringBootDataJPA.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
