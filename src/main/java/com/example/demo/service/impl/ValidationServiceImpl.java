
727824TUCS244 NELJOE BECKHAM X <727824tucs244@skct.edu.in>
2:52 PM (0 minutes ago)
to me, 727824tucs242, 727824tucs241, 727824tucs232

package com.example.demo.service.impl;
import java.util.*;
import com.example.demo.service.ValidationService;
import com.example.demo.repository.ValidationRepo;
import com.example.demo.entity.ValidationEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ValidationServiceImpl implements ValidationService{
     @Autowired ValidationRepo dent;
     
          @Override
          public ValidationEntity post(ValidationEntity stu){
               return dent.save(stu);
          }
}