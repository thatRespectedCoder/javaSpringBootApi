package com.example.springboot.entity;
import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="employee")
@Setter
@Getter
@ToString

public class Employee {
    @Id
    private int eno;
    private String ename;
    @ManyToOne
    @JoinColumn(name = "dno")
    private Department department;
    private String salary;
    
    // Constructors, getters, and setters
    
    public int getEno() {
        return eno;
    }
    
    public void setEno(int eno) {
        this.eno = eno;
    }
   
    public String getEname() {
        return ename;
    }
    
    public void setEname(String ename) {
        this.ename = ename;
    }
    
    public Department getDepartment() {
        return department;
    }
    
    public void setDepartment(Department dno, Department department) {
        this.department = department;
    }
    
    public String getSalary() {
        return salary;
    }
    
    public void setSalary(String salary) {
        this.salary = salary;
    }
}