CREATE SCHEMA IF NOT EXISTS customer;
CREATE TABLE IF NOT EXISTS customer.details (
    id serial PRIMARY KEY,
    customer_name varchar(255),
    joined_on TIMESTAMP NOT NULL,
    updated_on TIMESTAMP,
    borrowed_book_id integer,
    CONSTRAINT customer_book_id_fk FOREIGN KEY (borrowed_book_id) REFERENCES book.profile(id)
);