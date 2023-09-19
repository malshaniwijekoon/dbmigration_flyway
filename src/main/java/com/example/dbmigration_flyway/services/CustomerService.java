package com.example.dbmigration_flyway.services;

import com.example.dbmigration_flyway.models.CustomerProcData;
import com.example.dbmigration_flyway.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Transactional(readOnly = true)
    public Optional<CustomerProcData> getCustomerByBookId(int bookId){
        return customerRepository.getCustomerByBookId(bookId);
    }
}
