DROP DATABASE IF EXISTS `CursoBDD`;

CREATE DATABASE IF NOT EXISTS `CursoBDD` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;

USE `CursoBDD`;
DROP TABLE IF EXISTS `cartas`;
DROP TABLE IF EXISTS `usuarios`;

CREATE TABLE `cartas` (
	id INT AUTO_INCREMENT,
    nombre VARCHAR(64),
    rareza VARCHAR(64),
    expansion_name VARCHAR(64),
    precio INT,
    stock INT,
    image VARCHAR(1024),
    PRIMARY KEY (id)
) ENGINE=INNODB;

CREATE TABLE `usuarios`(
	id INT AUTO_INCREMENT,
    username VARCHAR(16),
    userpass VARCHAR(512),
    user_role VARCHAR(16),
    PRIMARY KEY (id)
) ENGINE=INNODB;

INSERT INTO cartas (nombre,rareza,expansion_name,precio,stock,image)
VALUES('Espeon','Rara','Lost Thunder',3000,100,'https://assets.pokemon.com/assets/cms2-es-es/img/cards/web/SM8/SM8_ES_89.png');
INSERT INTO cartas (nombre,rareza,expansion_name,precio,stock,image)
VALUES('Umbreon','Rara','Lost Thunder',3000,50,'https://assets.pokemon.com/assets/cms2-es-es/img/cards/web/SM8/SM8_ES_120.png');
INSERT INTO cartas (nombre,rareza,expansion_name,precio,stock,image)
VALUES('Flareon','Promo','SM Black Star Promos',3000,5,'https://assets.pokemon.com/assets/cms2-es-es/img/cards/web/SMP/SMP_ES_SM186.png');
INSERT INTO cartas (nombre,rareza,expansion_name,precio,stock,image)
VALUES('Jolteon','Rara','Hidden Fates',3000,100,'https://assets.pokemon.com/assets/cms2-es-es/img/cards/web/SM115/SM115_ES_23.png');
INSERT INTO cartas (nombre,rareza,expansion_name,precio,stock,image)
VALUES('Vaporeon','Rare','Hidden Fates',3000,100,'https://assets.pokemon.com/assets/cms2/img/cards/web/SM115/SM115_EN_18.png');
INSERT INTO cartas (nombre,rareza,expansion_name,precio,stock,image)
VALUES('Eevee','Común','Lost Thunder',3000,10000,'https://assets.pokemon.com/assets/cms2/img/cards/web/SM8/SM8_EN_155.png');
