CREATE DATABASE IF NOT EXISTS `student-management1`;

CREATE TABLE IF NOT EXISTS `student-management1`.`student2`(
	`id` INT NOT NULL,
    `name` VARCHAR(45) NULL,
    `age` INT NULL,
    `country` VARCHAR(45) NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `stuedent-management`.`Class` (
	`id` INT NOT NULL,
    `name` VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS `stuedent-management`.`Teacher` (
	`id` INT NOT NULL,
    `name` VARCHAR(45),
    `age` INT NULL,
    `country` VARCHAR(45)
);