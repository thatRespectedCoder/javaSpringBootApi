package com.example.springboot.entity;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="department")
@Setter
@Getter
@ToString

public class Department {
    @Id
    private int dno;
    private String dname;
    
    // Constructors, getters, and setters
    
    public int getDno() {
        return dno;
    }
    
    public void setDno(int dno) {
        this.dno = dno;
    }
    
    public String getDname() {
        return dname;
    }
    
    public void setDname(String dname) {
        this.dname = dname;
    }
}