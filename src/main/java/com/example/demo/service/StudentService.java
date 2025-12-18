package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.StudentEntity;
public interface StudentService{
    StudentEntity postData(StudentEntity stu);
    List<StudentEntity>getAllData();
    String deleteData(int id);
    StudentEntity findData(int id);
    StudentEntity updateData(int id,StudentEntity s);
}