CREATE TABLE customers (
    id BIGINT NOT NULL AUTO_INCREMENT,
    cpf VARCHAR(15) NOT NULL,
    first_name VARCHAR(15) NOT NULL,
    last_name VARCHAR(15) NOT NULL,
    UNIQUE(cpf),
    PRIMARY KEY (id)
);

CREATE TABLE accounts (
    id BIGINT NOT NULL AUTO_INCREMENT,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(15) NOT NULL,
    customer_id BIGINT NOT NULL,
    UNIQUE(email),
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES customers (id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE addresses (
    id BIGINT NOT NULL AUTO_INCREMENT,
    street VARCHAR(50) NOT NULL,
    number INT,
    complement VARCHAR(50),
    neighborhood VARCHAR(30) NOT NULL,
    city VARCHAR(20) NOT NULL,
    state VARCHAR(20) NOT NULL,
    zip_code VARCHAR(10) NOT NULL,
    country VARCHAR(15) NOT NULL,
    customer_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES customers (id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE contacts (
    id BIGINT NOT NULL AUTO_INCREMENT,
    telephone VARCHAR(16) NOT NULL,
    whatsapp VARCHAR(16),
    customer_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES customers (id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE products (
    id BIGINT NOT NULL AUTO_INCREMENT,
    code VARCHAR(11) NOT NULL,
    name VARCHAR(30) NOT NULL,
    description VARCHAR(255),
    size VARCHAR(2) NOT NULL,
    unit_price DECIMAL(10,2) NOT NULL,
    UNIQUE(code),
    PRIMARY KEY (id)
);

CREATE TABLE orders (
    id BIGINT NOT NULL AUTO_INCREMENT,
    date DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(),
    total_price DECIMAL(10,2) NOT NULL,
    customer_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES customers (id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE items (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    quantity INT NOT NULL,
    product_id BIGINT NOT NULL ,
    order_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (order_id) REFERENCES orders (id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE CASCADE ON UPDATE CASCADE
); 

INSERT INTO `customers`(`cpf`, `first_name`, `last_name`) VALUES ('91916713025','Pizza','Java');
INSERT INTO `contacts`(`telephone`, `whatsapp`, `customer_id`) VALUES ('081980807070','081980807070',1);
INSERT INTO `accounts`(`email`, `password`, `customer_id`) VALUES ('delivery@pizzajava.com','PizzaJava',1);
INSERT INTO `addresses`(`street`, `number`, `complement`, `neighborhood`, `city`, `state`, `zip_code`, `country`, `customer_id`) VALUES ('Avenida S??o Paulo', 909, null, 'Jardim S??o Paulo', 'Recife', 'Pernambuco', '53535209','Brasil', 1);
INSERT INTO `products` (`code`, `name`, `description`, `size`, `unit_price`) VALUES ('PZ00002','Calabresa','Recheio com queijo, molho de tomate, calabresa em rodelas, cebola, tomate picado, azeite e or??gano.','G',30);
INSERT INTO `products` (`code`, `name`, `description`, `size`, `unit_price`) VALUES ('PZ00003','Portuguesa','Recheio com queijo, azeitona, ovo cozido, presunto cozido, cebola, ervilha, molho de tomate e azeite.','G',50);
INSERT INTO `products` (`code`, `name`, `description`, `size`, `unit_price`) VALUES ('PZ00004','Mu??arela','Recheio com queijo mu??arela em abund??ncia, molho de tomate fresco, azeitona, rodelas de tomate e or??gano.','G',30);
INSERT INTO `products` (`code`, `name`, `description`, `size`, `unit_price`) VALUES ('PZ00005','Marguerita','Recheio com molho de tomate, manjeric??o, rodelas de tomate fresco, azeitona, queijo mu??arela e or??gano salpicado.','G',30);
INSERT INTO `products` (`code`, `name`, `description`, `size`, `unit_price`) VALUES ('PZ00006','Quatro queijos','Recheio com quatro queijos diferentes, como mu??arela, gorgonzola, parmes??o e catupiry.','G',40);
INSERT INTO `products` (`code`, `name`, `description`, `size`, `unit_price`) VALUES ('PZ00007','Frango com catupiry','Recheio com queijo mu??arela, frango, catupiry, s??lvia e molho de tomate.','G',40);
INSERT INTO `products` (`code`, `name`, `description`, `size`, `unit_price`) VALUES ('PZ00008','Napolitana','Recheio com tomate, azeite de oliva, or??gano e alho.','G',40);
INSERT INTO `products` (`code`, `name`, `description`, `size`, `unit_price`) VALUES ('PZ00009','Romeu e Julieta','Recheio com uma combina????o de queijo e de goiabada. ','G',40);
INSERT INTO `products` (`code`, `name`, `description`, `size`, `unit_price`) VALUES ('PZ00010','Atum','Recheio com atum, molho de tomate, e queijo mu??arela. Simples, mas deliciosa!','G',60);
INSERT INTO `products` (`code`, `name`, `description`, `size`, `unit_price`) VALUES ('PZ00011','Camar??o','Recheio com molho de tomate, mu??arela, camar??o, queijo parmes??o e manjeric??o.','G',60);
INSERT INTO `products` (`code`, `name`, `description`, `size`, `unit_price`) VALUES ('PZ00012','Pepperoni','Recheio com a lingui??a comum aqui do Brasil, de carne de porco e gordura.','G',45);
INSERT INTO `products` (`code`, `name`, `description`, `size`, `unit_price`) VALUES ('PZ00013','Canadense','Recheio com lombinho, champignon, cebola e bacon crocante coberto com queijo mu??arela.','G',50);