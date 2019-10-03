create database projeto1;

use projeto1;

CREATE TABLE departamento (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Nome varchar(60) DEFAULT NULL,
  PRIMARY KEY (Id)
);

CREATE TABLE vendedor (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Nome varchar(60) NOT NULL,
  Email varchar(100) NOT NULL,
  Aniversario datetime(6) NOT NULL,
  SalarioBase double NOT NULL,
  DepartamentoId int(11) NOT NULL,
  PRIMARY KEY (Id),
  FOREIGN KEY (DepartamentoId) REFERENCES departamento (id)
);

INSERT INTO departamento (Nome) VALUES 
  ('Computers'),
  ('Electronics'),
  ('Fashion'),
  ('Books');

INSERT INTO vendedor (Name, Email, Aniversario, SalarioBase, DepartamentoId) VALUES 
  ('Jose','Jose@gmail.com','2000-04-21 00:00:00',1800,1),
  ('Maria ','maria@gmail.com','1985-12-31 00:00:00',3510,2),
  ('Alexsandro','alexsandro@gmail.com','2004-01-15 00:00:00',4200,1),
  ('Martins','martins@gmail.com','2001-11-30 00:00:00',2000,4),
  ('Daniel','daniel@gmail.com','1999-01-09 00:00:00',5000,3),
  ('Ana','Ana@gmail.com','1999-03-04 00:00:00',6000,2);