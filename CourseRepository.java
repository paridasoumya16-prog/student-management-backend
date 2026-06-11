package com.soumya.studentmanagement.repository;

import com.soumya.studentmanagement.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
