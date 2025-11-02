package com.example.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CarRental.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
