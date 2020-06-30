package com.crujava.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String email;
    
    public int getId(){
        return id;
    }
    
    private void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    private void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    private void setEmail(String email){
        this.email = email;
    }
}
