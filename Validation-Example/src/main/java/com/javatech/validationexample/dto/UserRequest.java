package com.javatech.validationexample.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor

public class UserRequest {
    @NotNull(message="username should not be null")
    private String name;
    @Email(message = "invalid email adress")
    private String email;

    @Pattern(regexp="^\\d{10}$", message = "invalid mobile number enterd")

    private String mobile;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;
}
