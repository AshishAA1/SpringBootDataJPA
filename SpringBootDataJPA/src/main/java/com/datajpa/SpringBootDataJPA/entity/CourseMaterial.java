package com.datajpa.SpringBootDataJPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


// course material should not exist with out the course, it should consist the course
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseMaterial {

    @Id
    @SequenceGenerator(name = "course_material_sequence", sequenceName = "course_material_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "course_material_sequence")
    private Long courseMaterialId;

    private String url;

    @OneToOne
    @JoinColumn(
            name="course_Id",
            referencedColumnName = "courseId"
    )
    private Course course;

}
