INSERT INTO category (id, name) VALUES (1, 'shoes');
INSERT INTO category (id, name) VALUES (2, 'books');
INSERT INTO category (id, name) VALUES (3, 'electronics');

INSERT INTO product (id, name, description, price, create_at, category_id)
VALUES (2,'adidas shoes men', 'shoes running', 25000, '2022-10-23',1);

INSERT INTO product (id, name, description, price, create_at, category_id)
VALUES (3,'adidas shoes women', 'shoes running', 23000, '2022-10-23',1);

INSERT INTO product (id, name, description, price, create_at, category_id)
VALUES (4,'Spring Boot in Action', 'Book the basic rules of Spring Boot', 25000, '2022-10-23',2);