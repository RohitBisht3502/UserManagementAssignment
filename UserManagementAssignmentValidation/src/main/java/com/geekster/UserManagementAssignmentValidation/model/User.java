package com.geekster.UserManagementAssignmentValidation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @NotNull(message = "User Id not a Null value")
    private Integer userId;
    @NotBlank(message = "User Name not a blank value")
    private String userName;
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of birth must be in yyyy-MM-dd format")
    private String userDOB;
    @Email(message = "Invalid email format")
    private String userEmail;
    @Pattern(regexp = "\\+91\\d{10}", message = "Phone number must be in +91xxxxxxxxxx format")
    private String userNumber;

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    private LocalDateTime localDateTime;

}
