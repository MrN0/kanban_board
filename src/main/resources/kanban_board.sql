-- MySQL Script generated by MySQL Workbench
-- Sat Dec 18 16:43:07 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema kanban_board
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `kanban_board` ;

-- -----------------------------------------------------
-- Schema kanban_board
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `kanban_board` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `kanban_board` ;

-- -----------------------------------------------------
-- Table `kanban_board`.`city`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kanban_board`.`city` ;

CREATE TABLE IF NOT EXISTS `kanban_board`.`city` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(128) NULL,
  `postal_code` VARCHAR(16) NULL,
  `insee_code` VARCHAR(16) NULL,
  `complement` VARCHAR(255) NULL,
  `latitude` DOUBLE NOT NULL,
  `longitude` DOUBLE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 78403
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kanban_board`.`client`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kanban_board`.`client` ;

CREATE TABLE IF NOT EXISTS `kanban_board`.`client` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL,
  `city_id` BIGINT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_client_city_id` (`city_id` ASC) VISIBLE,
  CONSTRAINT `fk_client_city_id`
    FOREIGN KEY (`city_id`)
    REFERENCES `kanban_board`.`city` (`id`)
    ON UPDATE RESTRICT)
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kanban_board`.`column`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kanban_board`.`column` ;

CREATE TABLE IF NOT EXISTS `kanban_board`.`column` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kanban_board`.`developer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kanban_board`.`developer` ;

CREATE TABLE IF NOT EXISTS `kanban_board`.`developer` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(255) NULL,
  `last_name` VARCHAR(255) NULL,
  `email` VARCHAR(320) NULL,
  `birth_date` DATE NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 12
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kanban_board`.`project`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kanban_board`.`project` ;

CREATE TABLE IF NOT EXISTS `kanban_board`.`project` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `code` VARCHAR(3) NULL,
  `creation_date_time` DATETIME NULL,
  `delivery_date_time` DATETIME NULL,
  `client_id` BIGINT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_project_client_id` (`client_id` ASC) VISIBLE,
  UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE,
  CONSTRAINT `fk_project_client_id`
    FOREIGN KEY (`client_id`)
    REFERENCES `kanban_board`.`client` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kanban_board`.`projects_developers`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kanban_board`.`projects_developers` ;

CREATE TABLE IF NOT EXISTS `kanban_board`.`projects_developers` (
  `project_id` BIGINT NOT NULL,
  `developer_id` BIGINT NOT NULL,
  INDEX `fk_projects_developers_developer_id` (`developer_id` ASC) VISIBLE,
  INDEX `fk_projects_developers_project_id` (`project_id` ASC) VISIBLE,
  CONSTRAINT `fk_projects_developers_project_id`
    FOREIGN KEY (`project_id`)
    REFERENCES `kanban_board`.`project` (`id`),
  CONSTRAINT `fk_projects_developers_developer_id`
    FOREIGN KEY (`developer_id`)
    REFERENCES `kanban_board`.`developer` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kanban_board`.`task_type`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kanban_board`.`task_type` ;

CREATE TABLE IF NOT EXISTS `kanban_board`.`task_type` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(64) NOT NULL,
  `color` VARCHAR(64) NULL,
  `description` VARCHAR(1024) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kanban_board`.`task`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kanban_board`.`task` ;

CREATE TABLE IF NOT EXISTS `kanban_board`.`task` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `entitled` VARCHAR(255) NULL,
  `creation_date_time` DATETIME NULL,
  `hours_spent` INT NOT NULL,
  `hours_scheduled` INT NOT NULL,
  `project_id` BIGINT NOT NULL,
  `task_type_id` BIGINT NULL,
  `column_id` BIGINT NULL,
  `developer_id` BIGINT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_task_column_id` (`column_id` ASC) VISIBLE,
  INDEX `fk_task_developer_id` (`developer_id` ASC) VISIBLE,
  INDEX `fk_task_project_id` (`project_id` ASC) VISIBLE,
  INDEX `fk_task_task_type_id` (`task_type_id` ASC) VISIBLE,
  CONSTRAINT `fk_task_column_id`
    FOREIGN KEY (`column_id`)
    REFERENCES `kanban_board`.`column` (`id`),
  CONSTRAINT `fk_task_project_id`
    FOREIGN KEY (`project_id`)
    REFERENCES `kanban_board`.`project` (`id`),
  CONSTRAINT `fk_task_task_type_id`
    FOREIGN KEY (`task_type_id`)
    REFERENCES `kanban_board`.`task_type` (`id`),
  CONSTRAINT `fk_task_developer_id`
    FOREIGN KEY (`developer_id`)
    REFERENCES `kanban_board`.`developer` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 13
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
