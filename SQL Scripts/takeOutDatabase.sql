DROP SCHEMA takeout_database;

CREATE SCHEMA takeout_database;

USE takeout_database;

CREATE TABLE menu_items(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	display_name VARCHAR(30) NOT NULL,
	category ENUM('APPETIZER', 'MAIN', 'SIDE', 'DESSERT', 'DRINK') NOT NULL,
	description VARCHAR(150),
	price FLOAT(6,2) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE customers(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(30) NOT NULL,
	last_name VARCHAR(30) NOT NULL,
	phone VARCHAR(10) NOT NULL,
	email VARCHAR(30) NOT NULL,
	street VARCHAR(30) NOT NULL,
	city VARCHAR(30) NOT NULL,
	province CHAR(2) NOT NULL,
	postal_code CHAR(6) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE orders(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	customer_id INT UNSIGNED NOT NULL,
	date_time DATETIME NOT NULL, 
	paid_status BOOLEAN NOT NULL,
	pickup_status BOOLEAN NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY(customer_id) REFERENCES customers(id)
);

CREATE TABLE order_details(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	order_id INT UNSIGNED NOT NULL,
	menu_item_id INT UNSIGNED NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY(order_id) REFERENCES orders(id),
	FOREIGN KEY(menu_item_id) REFERENCES menu_items(id)
);






