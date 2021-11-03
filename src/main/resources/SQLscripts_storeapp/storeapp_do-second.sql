create table products
(
  id int NOT NULL AUTO_INCREMENT,
  product_name VARCHAR(255) not null,
  product_description VARCHAR(255) not null,
  product_price FLOAT not null,
  PRIMARY KEY (id)
);

create table cart
(
	id int NOT NULL AUTO_INCREMENT,
	item_name VARCHAR(255) not null,
    item_price FLOAT not null,
    cart_total FLOAT not null,
	item_quantity int not null,
    PRIMARY KEY (id)
);

ALTER TABLE cart AUTO_INCREMENT=100000;
  

  