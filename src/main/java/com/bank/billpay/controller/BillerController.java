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

}
