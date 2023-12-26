package com.aniket.microservices.bankingapplication.demobankingapplication.repository;

import com.aniket.microservices.bankingapplication.demobankingapplication.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
