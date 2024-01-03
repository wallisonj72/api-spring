package com.wallison.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallison.api.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
}
