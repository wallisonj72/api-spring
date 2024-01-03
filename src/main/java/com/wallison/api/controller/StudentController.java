package com.wallison.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        studentService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> edit(@PathVariable Long id, @RequestBody Student newStudent) {
        Student upStudent = studentService.edit(id, newStudent);
        return ResponseEntity.ok(upStudent);
    }
}
