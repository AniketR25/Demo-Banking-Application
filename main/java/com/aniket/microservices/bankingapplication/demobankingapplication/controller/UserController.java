package com.aniket.microservices.bankingapplication.demobankingapplication.controller;

import com.aniket.microservices.bankingapplication.demobankingapplication.dto.BankResponse;
import com.aniket.microservices.bankingapplication.demobankingapplication.dto.CreditDebitRequest;
import com.aniket.microservices.bankingapplication.demobankingapplication.dto.EnquiryRequest;
import com.aniket.microservices.bankingapplication.demobankingapplication.dto.UserRequest;
import com.aniket.microservices.bankingapplication.demobankingapplication.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }


    @GetMapping(path="balanceEnquiry", consumes = MediaType.ALL_VALUE)
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return userService.balanceEnquiry(request);
    }

    @GetMapping(path="nameEnquiry", consumes = MediaType.ALL_VALUE)
    public String nameEnquiry(@RequestBody EnquiryRequest request){

        return userService.nameEnquiry(request);
    }

    @PostMapping(path="credit", consumes = MediaType.ALL_VALUE)
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request){
        return userService.creditAccount(request);
    }

    @PostMapping(path="debit", consumes = MediaType.ALL_VALUE)
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){
        return userService.debitAccount(request);
    }

//    @PostMapping("transfer")
//    public BankResponse transfer(@RequestBody TransferRequest request){
//        return userService.transfer(request);
//    }

}
