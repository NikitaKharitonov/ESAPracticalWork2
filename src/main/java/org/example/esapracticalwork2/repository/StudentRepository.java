package org.example.esapracticalwork2.repository;

import org.example.esapracticalwork2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
