package com.wallison.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wallison.api.model.Student;
import com.wallison.api.service.StudentService;

@RestController
@RequestMapping("/student")
public record StudentController(StudentService studentService) {
    
    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping
    public List<Student> toList() {
        return studentService.toList();
    }
}
