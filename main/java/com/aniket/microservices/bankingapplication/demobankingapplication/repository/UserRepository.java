package com.aniket.microservices.bankingapplication.demobankingapplication.repository;

import com.aniket.microservices.bankingapplication.demobankingapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// provides methods that can talk to database. it will bind the User entity class whose id is primary key which is long format

public interface UserRepository extends JpaRepository<User, Long> {
    // checking if the user is new or existing
    Boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
    Boolean existsByAccountNumber(String accountNumber);
    User findByAccountNumber(String accountNumber);
}
