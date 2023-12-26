package com.aniket.microservices.bankingapplication.demobankingapplication.service.impl;

import com.aniket.microservices.bankingapplication.demobankingapplication.dto.TransactionDto;
import com.aniket.microservices.bankingapplication.demobankingapplication.entity.Transaction;
import com.aniket.microservices.bankingapplication.demobankingapplication.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionImpl implements TransactionService{

    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully");
    }
}
