CREATE TABLE IF NOT EXISTS book.profile (
    id serial PRIMARY KEY,
    book_name varchar(255),
    created_on TIMESTAMP NOT NULL,
    updated_on TIMESTAMP
);