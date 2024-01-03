package com.wallison.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wallison.api.model.Student;
import com.wallison.api.repository.StudentRepository;

@Service
public record StudentService(StudentRepository studentRepository) {

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> toList() {
        return studentRepository.findAll();
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    public Student edit(Long id, Student newStudent) {
        newStudent.setId(id);
        return studentRepository.save(newStudent);
    }
}
