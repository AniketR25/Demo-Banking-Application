package com.aniket.microservices.bankingapplication.demobankingapplication.utils;

import java.time.Year;
public class AccountUtils {
    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "User has an account";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account created successfully";
    public static final String ACCOUNT_NOT_EXIST_CODE = "003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE = "User with the given account number doesn't exist";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_SUCCESS = "User account found";

    public static final String ACCOUNT_CREDITED_SUCCESS = "005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "User account credited";

    public static final String INSUFFICIENT_BALANCE_CODE = "006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE = "Insufficient balance";

    public static final String ACCOUNT_DEBITED_SUCCESS = "007";
    public static final String ACCOUNT_DEBITED_SUCCESS_MESSAGE = "Account has been debited successfully";

    public static final String TRANSFER_SUCCESSFUL_CODE = "008";
    public static final String TRANSFER_SUCCESSFUL_MESSAGE = "Amount transferred Successfully";

    public static String generateAccountNumber(){
        // this will handle creation of new account number
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        // generating a random number between min and max
        int randNumber = (int)Math.floor(Math.random()*(max-min+1)+min);

        // converting currentYear and randNumber to String
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
//        StringBuilder accountNumber = new StringBuilder();
//        return accountNumber.append(year).append(randomNumber).toString();
        return year+randomNumber;
    }

}
