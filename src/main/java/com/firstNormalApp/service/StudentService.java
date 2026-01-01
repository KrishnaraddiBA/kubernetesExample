package com.firstNormalApp.service;

import com.firstNormalApp.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> findAll();
    public Student findById(int id);


}
