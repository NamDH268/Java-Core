DROP DATABASE IF EXISTS final_exam;
CREATE DATABASE final_exam;
USE final_exam;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
    id          INT PRIMARY KEY AUTO_INCREMENT,
    full_name   VARCHAR(50)                     NOT NULL,
    email       VARCHAR(50) UNIQUE KEY          NOT NULL,
    password    VARCHAR(50)                     NOT NULL DEFAULT '123456Q',
    role        ENUM('EMPLOYEE', 'ADMIN','MANAGER')       NOT NULL DEFAULT 'EMPLOYEE',
    pro_skill   VARCHAR(50),
    exp_in_year INT,
    ProjectId INT
);

INSERT INTO users (full_name        , email              , password  , role		 , pro_skill, exp_in_year, ProjectId)
VALUES            ('Đào Hải Nam', 'nam.dh@gmail.com', '123456Q' , 'MANAGER', 'manager'   , NULL    ,1   ),
                  ('Nguyễn văn lộc', 'loc.nv@gmail.com' , '123456Q' , 'EMPLOYEE'   , 'employee'     , NULL    ,1     ),
				  ('Nguyễn Ngọc Duy', 'duy.nn@gmail.com' , '123456Q' , 'ADMIN'   , NULL     , NULL    ,2     );

DROP PROCEDURE IF EXISTS find_by_email_and_password;
DELIMITER $$
CREATE PROCEDURE find_by_email_and_password (
	IN in_email     VARCHAR(50),
    IN in_password  VARCHAR(50)
)
BEGIN
	SELECT *
	FROM users
	WHERE email = in_email AND password = in_password;
END $$
DELIMITER ;