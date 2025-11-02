package com.example.CarRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CarRental.entity.Payment;
import com.example.CarRental.entity.User;
import com.example.CarRental.repository.UserRepository;
import com.example.CarRental.repository.PaymentRepository;

import java.util.List;

@Service
public class ServiceLayer {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PaymentRepository paymentRepo;

    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public Payment savePayment(Payment payment) {
        return paymentRepo.save(payment); // ✅ fixed
    }

    public List<Payment> getPayments() {
        return paymentRepo.findAll(); // ✅ fixed
    }

    public User authenticate(String username, String password) {
        User user = userRepo.findByUsername(username);
        if (user != null && user.getPassword() != null && user.getPassword().equals(password)) {
            return user;
        }
        throw new RuntimeException("Invalid credentials");
    }
}
