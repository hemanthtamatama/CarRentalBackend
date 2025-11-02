package com.example.CarRental.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private Double amount;
    private LocalDateTime date;

    public Payment() {
        this.date = LocalDateTime.now();
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }

	public static List<Payment> findAll1() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Payment save(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Payment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
