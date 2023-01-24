


select product_name from orders JOIN customers ON customers.id = orders.customer_id
where lower(customers.name) = lower(:name);