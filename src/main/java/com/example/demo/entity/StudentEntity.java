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
    public StudentEntity(){

    }
    public StudentEntity(Long id,String name,String email,float cgpa){
        
    }



    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public float getCgpa(){
        return this.cgpa;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
    }
    
}