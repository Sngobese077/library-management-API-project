package com.myproject.java.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int reg_no;

    @Column(name = "student_name")
    private String student_name;

    public Student() {
    }

    public Student(String student_name) {
        this.student_name = student_name;
    }

    public int getReg_no() {
        return reg_no;
    }

    public void setReg_no(int reg_no) {
        this.reg_no = reg_no;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "reg_no=" + reg_no +
                ", student_name='" + student_name + '\'' +
                '}';
    }
}
