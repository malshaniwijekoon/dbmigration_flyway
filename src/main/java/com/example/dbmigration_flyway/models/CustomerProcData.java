package com.example.dbmigration_flyway.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@NamedStoredProcedureQuery(
        name = "CustomerStoredProc",
        procedureName = "customer.customer_details_with_borrowed_book",
        resultClasses = {
                CustomerProcData.class
        },
        parameters = {
                @StoredProcedureParameter(name = "param_book_id", mode = ParameterMode.IN, type = Integer.class)
        }
)
public class CustomerProcData implements Serializable {
    @Id
    @JsonProperty(value="CustomerId")
    @Column(name = "customer_id")
    int id;

    @JsonProperty(value="CustomerName")
    @Column(name = "customer_name")
    String customerName;

    @JsonProperty(value="BookId")
    @Column(name = "book_id")
    int bookId;

    @JsonProperty(value="BookName")
    @Column(name = "book_name")
    String bookName;
}
