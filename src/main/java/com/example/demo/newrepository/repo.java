package com.example.demo.newrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.newentity.StudentValidation;
@Repository
public interface repo extends JpaRepository<newentity,Long>{
}
