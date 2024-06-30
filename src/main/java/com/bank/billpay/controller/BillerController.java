package com.bank.billpay.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BillerController {

    @GetMapping("/biller-details")
    public ResponseEntity<?> getBiller(){
        Map<String,Object> data = new HashMap<>();
        data.put("message","bills coming soon");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @GetMapping("/transaction-history")
    public ResponseEntity<?> history(){
        Map<String,Object> data = new HashMap<>();
        data.put("message","transaction coming soon");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @GetMapping("/biller-accounts")
    public ResponseEntity<?> billerAccounts(){
        Map<String,Object> data = new HashMap<>();
        data.put("message","Biller Accounts coming soon");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
    @GetMapping("/parent-biller-category")
    public ResponseEntity<?> categories(){
        Map<String,Object> data = new HashMap<>();
        data.put("message","parent-biller-categories  coming soon");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

}
