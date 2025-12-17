package com.example.demo.newservice;

import com.example.demo.newentity.StudentValidation;

public interface StudentValidation{
    StudentValidation savedata(StudentValidation newfile);
    StudentValidation getid(Long id);
}