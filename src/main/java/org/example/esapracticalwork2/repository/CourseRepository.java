package org.example.esapracticalwork2.repository;

import org.example.esapracticalwork2.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
