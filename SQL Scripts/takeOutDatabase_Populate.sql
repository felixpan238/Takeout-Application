
-- INSERT test values into menu_items
INSERT INTO menu_items VALUES(NULL, 'Nachos', 'APPETIZER', 'Some text.', 3.99);
INSERT INTO menu_items VALUES(NULL, 'Ceasar Salad', 'APPETIZER', 'Some text.', 2.99);
INSERT INTO menu_items VALUES(NULL, 'Hot Dog', 'MAIN', 'Some text.', 2.50);
INSERT INTO menu_items VALUES(NULL, 'Cheese Burger', 'MAIN', 'Some text.', 2.99);
INSERT INTO menu_items VALUES(NULL, 'Personal Pizza', 'MAIN', 'Some text.', 4.99);
INSERT INTO menu_items VALUES(NULL, 'Fries', 'SIDE', 'Some text.', 1.99);
INSERT INTO menu_items VALUES(NULL, 'Side Ceasar Salad', 'SIDE', 'Some text.', 1.99);
INSERT INTO menu_items VALUES(NULL, 'Apple Pie', 'DESSERT', 'Some text.', 3.99);
INSERT INTO menu_items VALUES(NULL, 'Ice Cream', 'DESSERT', 'Some text.', 2.99);
INSERT INTO menu_items VALUES(NULL, 'Soda', 'DRINK', 'Some text.', 2.99);
INSERT INTO menu_items VALUES(NULL, 'Coffee', 'DRINK', 'Some text.', 1.99);
INSERT INTO menu_items VALUES(NULL, 'Tea', 'DRINK', 'Some text.', 1.99);

-- INSERT test values into customers
INSERT INTO customers VALUES(NULL, 'Albert', 'ALbertson', '1234567890', 'albert@email.com', '123 Alberts St', 'Toronto', 'ON', 'A1B2C3');
INSERT INTO customers VALUES(NULL, 'Brendan', 'Baker', '1234567890', 'brendan@email.com', '123 Brendans St', 'Toronto', 'ON', 'A1B2C3');
INSERT INTO customers VALUES(NULL, 'Carl', 'Carry', '1234567890', 'carl@email.com', '123 Carls St', 'Toronto', 'ON', 'A1B2C3');
INSERT INTO customers VALUES(NULL, 'Donald', 'Davidson', '1234567890', 'donald@email.com', '123 Donalds St', 'Toronto', 'ON', 'A1B2C3');
INSERT INTO customers VALUES(NULL, 'Eric', 'Edison', '1234567890', 'eric@email.com', '123 Erics St', 'Toronto', 'ON', 'A1B2C3');

-- INSERT test values into orders
INSERT INTO orders VALUES(NULL, 1, '2017-08-07 02:35:00', TRUE, TRUE);
INSERT INTO orders VALUES(NULL, 1, '2017-08-08 03:35:00', TRUE, TRUE);
INSERT INTO orders VALUES(NULL, 2, '2017-08-10 05:35:00', TRUE, TRUE);
INSERT INTO orders VALUES(NULL, 3, '2017-08-10 02:35:00', TRUE, FALSE);
INSERT INTO orders VALUES(NULL, 4, '2017-08-11 06:35:00', FALSE, FALSE);
INSERT INTO orders VALUES(NULL, 5, '2017-08-11 07:35:00', FALSE, FALSE);

-- INSERT test values into orders
INSERT INTO order_details VALUES(NULL, 1, 3);
INSERT INTO order_details VALUES(NULL, 1, 6);
INSERT INTO order_details VALUES(NULL, 2, 4);
INSERT INTO order_details VALUES(NULL, 3, 2);
INSERT INTO order_details VALUES(NULL, 4, 6);
INSERT INTO order_details VALUES(NULL, 5, 7);