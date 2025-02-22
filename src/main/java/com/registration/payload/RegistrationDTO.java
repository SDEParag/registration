package com.registration.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDTO {
    private Long id;
    private String name;
    private MultipartFile profilePhoto;
    private String gender;
    private String address;
    private String city;

    @Pattern(regexp = "^[0-9]{6}$", message = "Pin must be a 6-digit numeric value")
    private String pin;

    private String state;

    @Email(message = "Invalid email format")
    private String email;

    @Pattern(regexp = "^[0-9]{10}$", message = "Contact must be a 10-digit numeric value")
    private String contact;
}