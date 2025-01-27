package com.registration.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] profilePhoto;

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