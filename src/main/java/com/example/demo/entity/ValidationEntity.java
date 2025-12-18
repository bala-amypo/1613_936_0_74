package com.example.demo.entity;
import jakarat.persistence.Entity;
import jakarat.persistence.Id;
import jakarat.persistence.GeneratedValue;
import jakarat.persistence.GenerationType;
import jakarat.validation.constraints.NotNull;
import jakarat.validation.constraints.Size;
import jakarat.validation.constraints.Email;
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Integer age;
    @NotNull
    @Size(min=2,max=10,message="must be 2 to 10 characters")
    private String username;
    @Email
    private String email;
    @Min(2)
    @Max(8)

    private String password;
}
