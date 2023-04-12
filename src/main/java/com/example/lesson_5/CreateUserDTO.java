package com.example.lesson_5;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.Objects;
@Data
public class CreateUserDTO {
    @NotBlank(message=" '${validatedValue}'  name field must be filled")
    @Size(min=3,max=20, message= "min=3,max=20")
    private String name;
    private int age;
    @NotBlank(message="name field must be filled")
    private String gender;
    @NotBlank(message="name field must be filled")
    private String company;
    @Email()
    private String email;
    @NotBlank(message="name field must be filled")
    private String phone;

    public CreateUserDTO(String name, int age, String gender, String company, String email, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.email = email;
        this.phone = phone;
    }

    public CreateUserDTO() {
        super();
    }

   }
