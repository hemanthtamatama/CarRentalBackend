package com.example.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CarRental.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
