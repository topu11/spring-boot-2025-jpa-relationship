package com.pabna.springJPARelationShip;

import com.pabna.springJPARelationShip.entities.Laptop;
import com.pabna.springJPARelationShip.entities.Student;
import com.pabna.springJPARelationShip.reposatories.LaptopRepository;
import com.pabna.springJPARelationShip.reposatories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@SpringBootApplication
public class SpringJpaRelationShipApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(SpringJpaRelationShipApplication.class);

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private LaptopRepository laptopRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaRelationShipApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        Laptop laptop = new Laptop();

        // This part is For Non CaseCade
//		student.setStudentId(1);
//		student.setStudentName("Touhid");
//		student.setStudentAbout("Good BOY");
//		studentRepository.save(student);
//
//		laptop.setLaptopId(10);
//		laptop.setBrand("assus");
//		laptop.setModelNumber("asus125");
//		laptop.setStudent(student);
//		laptopRepository.save(laptop);

        // This part is For  CaseCade
//        student.setStudentId(2);
//        student.setStudentName("Touhid");
//        student.setStudentAbout("Good BOY");
//
//
//
//        laptop.setLaptopId(12);
//        laptop.setBrand("assus");
//        laptop.setModelNumber("asus125");
//
//        laptop.setStudent(student);
//        student.setLaptop(laptop);
//
//        studentRepository.save(student);

        //logger.info("Student and Laptop saved successfully.");

       List<Student> studentList=studentRepository.findAll();
       //System.out.println(studentList);
        studentList.forEach(item -> {
            System.out.println(item.getStudentId());
        });
    }
}
