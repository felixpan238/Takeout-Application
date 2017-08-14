SELECT ordered_details.id, menu_items.display_name, menu_items.category, menu_items.price
FROM ordered_details 
INNER JOIN menu_items ON ordered_details.menu_item_id = menu_items.id
WHERE order_id = 1;