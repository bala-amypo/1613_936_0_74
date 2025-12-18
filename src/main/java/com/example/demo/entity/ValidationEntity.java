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
    @NotNull
    @Size(min=2,max=10,message="must be 2 to 10 characters")
    private String username;
    @Email(message = "Email is not valid")
    private String email;
    @Size(min=2,max=10,message="must be 2 to 10 characters")
    @NotNull(message="Password is mandatory")
    private String password;
    @Max(20)
    @

    private Integer age;
      public ValidationEntity(Long id,String username,String email,String password){
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
    }
}
