package com. example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistance.Id;
import jakarta.persistance.GenerationType;
import jakarta.persistance.GeneratedValue;
@Entity
//@table(name="student")
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;

}