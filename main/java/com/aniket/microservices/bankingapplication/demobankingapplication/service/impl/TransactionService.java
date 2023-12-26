package com.aniket.microservices.bankingapplication.demobankingapplication.service.impl;

import com.aniket.microservices.bankingapplication.demobankingapplication.dto.TransactionDto;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
