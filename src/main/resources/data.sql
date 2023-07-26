DROP TABLE IF EXISTS student;

CREATE TABLE student
(
	id varchar(255),
	name varchar(255),
	location varchar(255),
	birth_date timestamp,
	primary key (id)
);

INSERT INTO student (id, name, location, birth_date) 
VALUES
    (1, 'Mohammad Farhan', 'Depok', NOW()),
    (2, 'Mohammad Zydan', 'Depok', NOW()),
    (3, 'Rizman', 'Depok', NOW());