package com.example.demo.service;
import com.example.demo.entity.StudentEntity;

public interface StudentService{
    StudentEntity postData(StudentEntity entity);
    List<StudentEntity>getAllData;
}