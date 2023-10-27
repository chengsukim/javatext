DROP DATABASE IF EXISTS proj1;
CREATE DATABASE proj1;
USE proj1;
CREATE TABLE article (
id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
title CHAR(100) NOT NULL UNIQUE,
content TEXT,
userId INT UNSIGNED NOT NULL,
regDate DATETIME NOT NULL
);
SELECT * FROM article;

INSERT INTO article
SET id = 3,
title = "test3",
content = "test3",
userId = 1,
regDate = NOW();

INSERT INTO article
SET id = 4,
title = "test4",
content = "test4",
userId = 2,
regDate = NOW();


CREATE TABLE `member`(
id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
userId CHAR(100) NOT NULL UNIQUE,
`password` VARCHAR(100) NOT NULL,
regDate DATETIME NOT NULL
);



SELECT * FROM `member`;