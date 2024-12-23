-- 01-create-tables.sql
CREATE DATABASE IF NOT EXISTS shopping;

CREATE TABLE IF NOT EXISTS shopping.items (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    img_path VARCHAR(100) NULL,
    price INT NULL,
    discount_per INT NULL
    );

CREATE TABLE IF NOT EXISTS shopping.members (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    CONSTRAINT email UNIQUE (email)
    );

CREATE TABLE IF NOT EXISTS shopping.carts
(
    id        int auto_increment primary key,
    member_id int not null,
    item_id   int not null
);
