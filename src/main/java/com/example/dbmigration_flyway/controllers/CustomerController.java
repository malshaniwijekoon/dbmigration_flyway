package com.example.dbmigration_flyway.controllers;

import com.example.dbmigration_flyway.models.CustomerProcData;
import com.example.dbmigration_flyway.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/getCustomerByBookId")
    @ResponseBody
    public Optional<CustomerProcData> getCustomerByBookId(@RequestParam int bookId) {
        return customerService.getCustomerByBookId(bookId);
    }
}
