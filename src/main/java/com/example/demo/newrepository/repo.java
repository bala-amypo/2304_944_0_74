package com.example.demo.newrepository;

import org.springframework.data.jpa.newrepository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.newentity.Student;
@Repository
public interface repo extends JpaRepository<newentity,Long>{
}
