package com.aniket.microservices.bankingapplication.demobankingapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

// saving the data to the database is the usecase of dto (data transfer object) and requesting the data from user
// it is not similar to entity which we want to expose to user
// builder is used to create object
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String password;
    private String phoneNumber;
}
