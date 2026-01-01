package com.firstNormalApp.controller;

import com.firstNormalApp.entity.Student;
import com.firstNormalApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/saveStudent")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        Student student1 = studentService.saveStudent(student);
        return new ResponseEntity<>(student1, HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Student>> findAll(){
        List<Student> all = studentService.findAll();
        return new ResponseEntity<>(all,HttpStatus.FOUND);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Student> findById(@PathVariable int id){
        Student byId = studentService.findById(id);
        return new ResponseEntity<>(byId,HttpStatus.FOUND);
    }



}
