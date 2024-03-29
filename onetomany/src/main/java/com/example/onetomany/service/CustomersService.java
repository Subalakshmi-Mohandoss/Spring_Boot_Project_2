package com.example.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetomany.model.Customers;
import com.example.onetomany.repository.CustomersRepo;

@Service
public class CustomersService {
    @Autowired
    private CustomersRepo cr;

    public Customers insert(Customers c) {
        return cr.save(c);
    }
}