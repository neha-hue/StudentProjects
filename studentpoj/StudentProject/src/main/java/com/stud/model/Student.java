package com.stud.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer rollNo;
	 @NotBlank(message = "Student name is required")
private String studentName;
	 @NotBlank(message = "Student email is required")
	    @Email(message = "Invalid email format")
private String studentEmail;
	 @NotBlank(message = "Mobile number is required")
private String mobileNumber;
@Embedded
@NotNull(message = "Address is required")
private Address address;
}
