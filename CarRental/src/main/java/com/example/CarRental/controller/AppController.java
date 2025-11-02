package com.example.CarRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarRental.entity.Payment;
import com.example.CarRental.entity.User;
import com.example.CarRental.service.ServiceLayer;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppController {
    @Autowired
    private ServiceLayer service;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.saveUser(user);
    }

    @PostMapping("/payment")
    public Payment pay(@RequestBody Payment payment) {
        return service.savePayment(payment);
    }

    @GetMapping("/payments")
    public List<Payment> getPayments() {
        return service.getPayments();
    }
}
