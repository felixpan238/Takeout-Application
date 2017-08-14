SELECT customers.id, customers.first_name, customers.last_name, customers.phone, menu_items.display_name, menu_items.price, orders.date_time, orders.paid_status, orders.pickup_status
FROM ordered_details 
INNER JOIN menu_items ON ordered_details.menu_item_id = menu_items.id
INNER JOIN orders ON ordered_details.order_id = orders.id
INNER JOIN customers ON orders.customer_id = customers.id;