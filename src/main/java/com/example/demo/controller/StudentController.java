package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class Studentcontroller {
    @Autowired
    Studentservice src;
    @PostMapping("/post")

    public Student postdata(@RequestBody Student st){
        return src.savedata(st);
    }

    @GetMapping("/get")
    public List<Student> getdata(){
        return src.retdata();
    }

    @GetMapping("/getid/{id}")
    public Student getIdVal(@PathVariable int id){
        return src.id(id);
    }

    public 
}