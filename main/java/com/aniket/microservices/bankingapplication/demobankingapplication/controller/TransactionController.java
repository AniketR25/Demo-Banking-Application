//package com.aniket.microservices.bankingapplication.demobankingapplication.controller;
//
//import com.aniket.microservices.bankingapplication.demobankingapplication.entity.Transaction;
//import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/bankStatement")
//@AllArgsConstructor
//public class TransactionController {
//    private BankStatement bankStatement;
//
//    @GetMapping
//    public List<Transaction> generateBankStatement(@RequestParam String accountNumber,
//                                                   @RequestParam String startDate,
//                                                   @RequestParam String endDate) throws DocumentException, FileNotFoundException {
//        return bankStatement.generateStatement(accountNumber, startDate, endDate);
//    }
//}
