CREATE OR REPLACE FUNCTION customer.customer_details_with_borrowed_book(
    IN param_book_id integer
)
RETURNS TABLE (
    customer_id integer,
    customer_name varchar(255),
    book_id integer,
    book_name varchar(255)
)
LANGUAGE plpgsql AS $function$
BEGIN
    RETURN QUERY
        SELECT cd.id AS customer_id,
               cd.customer_name AS customer_name,
               bp.id AS book_id,
               bp.book_name AS book_name
        FROM customer.details cd
        INNER JOIN book.profile bp
        ON bp.id = cd.borrowed_book_id
        WHERE bp.id = param_book_id;
END;
$function$