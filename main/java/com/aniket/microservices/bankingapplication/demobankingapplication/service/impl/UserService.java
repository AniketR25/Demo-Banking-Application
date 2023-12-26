package com.aniket.microservices.bankingapplication.demobankingapplication.service.impl;

import com.aniket.microservices.bankingapplication.demobankingapplication.dto.BankResponse;
import com.aniket.microservices.bankingapplication.demobankingapplication.dto.CreditDebitRequest;
import com.aniket.microservices.bankingapplication.demobankingapplication.dto.EnquiryRequest;
import com.aniket.microservices.bankingapplication.demobankingapplication.dto.UserRequest;

public interface UserService {
    // BankResponse is the return type which takes input from UserRequest. the method is createAccount
    BankResponse createAccount(UserRequest userRequest);
    // BankResponse is the return type which takes input from EnquiryRequest
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);

    BankResponse creditAccount(CreditDebitRequest request);

    BankResponse debitAccount(CreditDebitRequest request);

}
