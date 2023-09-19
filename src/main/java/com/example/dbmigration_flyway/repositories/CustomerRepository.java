package com.example.dbmigration_flyway.repositories;

import com.example.dbmigration_flyway.models.CustomerProcData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository  extends JpaRepository<CustomerProcData,Integer> {
    @Procedure(procedureName = "customer.customer_details_with_borrowed_book")
    public Optional<CustomerProcData> getCustomerByBookId(@Param("param_book_id") int bookId);
}
