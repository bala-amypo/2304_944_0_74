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
        return rep.get(id);
    }
    @Override
    public List<StudentValidation> getall(){
        return rep.get();
    }
    @Override
    public Student update(Long id,StudentEntity st){
        return rep.update(id,st)
    }
    @Override
    public void delete(Long id){
        return rep.remove(id)
    }
}