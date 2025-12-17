package com.example.demo.newcontroller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.newentity.StudentValidation;
import com.example.demo.newservice.newfileservice;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RequestMapping("/students")
public class newFileControl{
    private final newfileservice service;
    @Autowired
    newfileservice src;
    @PostMapping("/post")

    public StudentValidation postdata(@RequestBody Studententity st){
        return src.savedata(st);
    }

    @GetMapping("/get")
    public List<Studententity> getdata(){
        return src.retdata();
    }

    @GetMapping("/getid/{id}")
    public StudentValidation getIdVal(@PathVariable int id){
        return src.id(id);
    }

    @PutMapping("/update/{id}")
    public StudentValidation updateVal(@PathVariable int id,@RequestBody Studententity st){
        return src.updid(id,st);
    }

    @DeleteMapping("/delete/{id}")
    public StudentValidation deleteVal(@PathVariable int id){
        return src.dltid(id);
    }
}
