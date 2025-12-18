package com.example.demo.service.impl;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepo;
import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
// import org.springframework.beans.factory.annotation.Override;
@Service
public class StudentServiceImpl implements StudentService{
     @Autowired StudentRepo student;
     @Override
      public StudentEntity postData(StudentEntity stu){
          return student.save(stu);
     }
     @override
     public List<StudentEntity>getAllData(){
        return student.findAll();
     }
}