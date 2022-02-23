package com.example.demo.student;


import jdk.jfr.ContentType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {


    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "allstudents")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping(path = "addstudent")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);

    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);

    }
    @PutMapping(path ="{studentId}")
    public void updateStudent(@PathVariable("studentId")Long studentId,
                              @RequestParam(required = false)String name,
                              @RequestParam(required = false)String email){
        studentService.updateStudent(studentId,name,email);
    }


}
