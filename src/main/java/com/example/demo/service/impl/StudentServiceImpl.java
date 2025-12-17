package com.example.demo.service;
import java.util.List;

import java.util.Optional;
import com.example.demo.entity.StudentEntity;

public interface StudentService {
    Student insert udent(Student St);
    List<Student> getAllStudents();
    Optional<Student> getOneStudent(Long id);
    void deleteStudent(Long id);
}