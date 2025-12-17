package com.example.service.impl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.newentity.StudentValidation;
import com.example.demo.newservice.newfileservice;

@Service
public class newfileserviceimpl implements newservice{

    private final NewFileRepo rep;

    public NewfileServiceImpl(NewfileRepo rep){
        this.rep=rep;
    }
    @Override
    public StudentValidation savedata(StudentValidation st){
        return rep.save(newfile);
    }
    @Override
    public StudentValildation getid(Long id){
        return rep.findById(id);
    }
    @Override
    public List<StudentValidation> getall(){
        return rep.findAll();
    }
    @Override
    public StudentValidation update(Long id,StudentValidation st){
        NewFileEntity existing=getValId(id);
        existing.setName(Newfile.getName());
        existing.setEmail(Newfile.getEmail());

        return rep.save(existing);
    }
    @Override
    public void delete(Long id){
        rep.delete(id)
    }
}