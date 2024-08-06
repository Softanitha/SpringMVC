package com.example.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvc.entity.Customer;

public interface CustomRepo extends JpaRepository<Customer, Long> {

}
