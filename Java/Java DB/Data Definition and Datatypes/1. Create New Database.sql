CREATE DATABASE `example_minions`;

CREATE TABLE `minions` (
  `idminions` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `town_id` int(11) NOT NULL,
  PRIMARY KEY (`idminions`),
  KEY `fk_minions_towns_idx` (`town_id`),
  CONSTRAINT `fk_minions_towns` FOREIGN KEY (`town_id`) REFERENCES `towns` (`idtowns`)
);

CREATE TABLE `towns` (
  `idtowns` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`idtowns`)
);
