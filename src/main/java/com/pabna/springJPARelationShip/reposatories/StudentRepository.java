package com.pabna.springJPARelationShip.reposatories;

import com.pabna.springJPARelationShip.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {
}
