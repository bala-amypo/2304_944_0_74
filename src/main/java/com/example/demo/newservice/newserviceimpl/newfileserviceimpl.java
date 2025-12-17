package com.example.service.impl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    private final NewFileRepo rep;

    public NewfileServiceImpl(NewfileRepo rep){
        this.rep=rep;
    }
    @Override
    public StudentValidation savedata(StudentValidation st){
        return rep.save(newfile);
    }
    @Override
    public StudentValildation getidval(Long id){
        return rep.findById(id);
    }
    @Override
    public List<StudentValidation> getall(){
        return rep.findAll();
    }
    @Override
    public Student update(Long id,StudentEntity st){
        return rep.update(id,newfile)
    }
    @Override
    public void delete(Long id){
        rep.deleteById(id)
    }
}