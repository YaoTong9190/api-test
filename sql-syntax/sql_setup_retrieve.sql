CREATE DATABASE java_test;
use java_test;
CREATE TABLE name (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);
SELECT * FROM java_test.name;
insert into java_test.name (id, first_name, last_name) values (1, 'Sam','Smith');
insert into java_test.name (id, first_name, last_name) values (2, 'Mary','Jones');