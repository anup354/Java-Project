CREATE TABLE admintable (
    admin_id int NOT NULL AUTO_INCREMENT,
    admin_name varchar (255) NOT NULL,
    admin_password varchar(255) NOT NULL,
     PRIMARY KEY (admin_id)
);

INSERT INTO admintable (admin_name, admin_password)
VALUES ('admin', 'admin12');

CREATE TABLE categorytable (
    category_id int NOT NULL AUTO_INCREMENT,
    category_name varchar(255) NOT NULL,
    category_description varchar(255) NOT NULL,
     PRIMARY KEY (category_id)
);
CREATE TABLE producttable (
    product_id int NOT NULL AUTO_INCREMENT,
    product_name varchar(255) NOT NULL,
    product_quantity int NOT NULL,
	product_price int NOT NULL,
     PRIMARY KEY (product_id)
);
CREATE TABLE sellertable (
    seller_id int NOT NULL AUTO_INCREMENT,
    seller_name varchar(255) NOT NULL,
    seller_password varchar(255) NOT NULL,
    seller_gender varchar(10) NOT NULL,
     PRIMARY KEY (seller_id)
);