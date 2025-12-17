package com.example.demo.entity;


import jakarta.persistence.*;
public class StudentEntity{

    private Long id;
    private String name;
    private String email;
    private float cgpa;

    public StudentEntity(Long id,String name,String email,float cgpa){
        this.id=id;
        this.name=name;
        this.email=email;
        this.cgpa=cgpa;
    }

    public StudentEntity(){

    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getCgpa(){
        return cgpa;
    }
    public void setCgpa(String cgpa){
        this.cgpa=cgpa;
    }
}