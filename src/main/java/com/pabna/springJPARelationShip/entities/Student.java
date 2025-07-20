package com.pabna.springJPARelationShip.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    private int studentID;
    private String studentName;
    private String studentAbout;

}
