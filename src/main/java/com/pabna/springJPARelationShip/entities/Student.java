package com.pabna.springJPARelationShip.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String studentAbout;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Laptop laptop;

    public Student() {
    }

    public Student(int studentId, String studentName, String studentAbout, Laptop laptop) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAbout = studentAbout;
        this.laptop = laptop;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAbout() {
        return studentAbout;
    }

    public void setStudentAbout(String studentAbout) {
        this.studentAbout = studentAbout;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
