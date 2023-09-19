package com.example.dbmigration_flyway.modules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="customer")
@Getter
@Setter
public class Customer {

    @Id
    @JsonProperty(value="Id")
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @JsonProperty(value="CustomerName")
    @Column(name = "customer_name")
    String customerName;

    @JsonProperty(value="JoinedOn")
    @Column(name = "joined_on")
    Date joinedOn;

    @JsonProperty(value="UpdatedOn")
    @Column(name = "updated_on")
    Date updatedOn;

    @JsonProperty(value="BorrowedBookId")
    @Column(name = "borrowed_book_id")
    int BorrowedBookId;
}
