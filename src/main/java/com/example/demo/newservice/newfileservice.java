package com.example.demo.newservice;

import com.example.demo.newentity.StudentValidation;

public interface StudentValidation{
    StudentValidation savedata(StudentValidation newfile);
    StudentValidation getid(Long id);
    List<StudentValidation> getall();
    StudentValidation update(Long id,StudentValidation newfile);
    void delete(Long id);
}