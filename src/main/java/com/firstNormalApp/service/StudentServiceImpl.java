package com.firstNormalApp.service;

import com.firstNormalApp.entity.Student;
import com.firstNormalApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        Student student1 = studentRepository.save(student);
        return student1;
    }

    @Override
    public List<Student> findAll() {

        List<Student> all = studentRepository.findAll();
        return all;
    }

    @Override
    public Student findById(int id) {
        Optional<Student> byId = studentRepository.findById(id);
        Student student = byId.get();
        return student;
    }
}
