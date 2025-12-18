package com.example.demo.entity;
import jakarat.persistence.Entity;
import jakarat.persistence.Id;
import jakarat.persistence.GeneratedValue;
import jakarat.persistence.GenerationType;
import jakarat.persistence.NotNull;
import jakarat.persistence.consSize;
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Integer age;
    @NotNull
    private String username;
    private String email;
    private String password;
}
