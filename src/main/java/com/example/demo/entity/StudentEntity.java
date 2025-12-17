package com. example.demo.entity;
import jakarta.persistence.Entity;

@Entity
//@table(name="student")
public class StudentEntity{
    private Long id;
    private String name;
    private String email;
    private float cgpa;
    
}