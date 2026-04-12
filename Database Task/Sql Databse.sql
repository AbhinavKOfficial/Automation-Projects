CREATE DATABASE COMPANY_SYSTEM;
USE COMPANY_SYSTEM;

-- Table 1
CREATE TABLE Staff (
    STAFF_ID INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(30),
    SURNAME VARCHAR(30),
    PAY INT,
    JOINED_ON DATETIME,
    TEAM VARCHAR(30)
);

-- Insert Data
INSERT INTO Staff (NAME, SURNAME, PAY, JOINED_ON, TEAM) VALUES
('Rohit', 'Gupta', 95000, '2015-03-12 10:00:00', 'Tech'),
('Sneha', 'Agarwal', 70000, '2016-07-22 09:30:00', 'Support'),
('Arjun', 'Reddy', 200000, '2015-03-12 10:00:00', 'Tech'),
('Pooja', 'Nair', 300000, '2015-03-12 10:00:00', 'Support'),
('Kunal', 'Jain', 300000, '2016-07-22 09:30:00', 'Support'),
('Meena', 'Das', 150000, '2016-07-22 09:30:00', 'Finance'),
('Ramesh', 'Iyer', 60000, '2015-01-05 09:00:00', 'Finance'),
('Tina', 'Roy', 85000, '2015-05-18 09:15:00', 'Support');

-- Table 2
CREATE TABLE Rewards (
    STAFF_LINK_ID INT,
    REWARD_AMOUNT INT,
    REWARD_DATE DATE,
    FOREIGN KEY (STAFF_LINK_ID) REFERENCES Staff(STAFF_ID)
);

INSERT INTO Rewards VALUES
(1, 4000, '2017-02-10'),
(2, 2000, '2017-06-15'),
(3, 3500, '2017-02-10'),
(1, 3000, '2017-02-10'),
(2, 2500, '2017-06-15');

-- Table 3
CREATE TABLE Positions (
    STAFF_LINK_ID INT,
    ROLE_NAME VARCHAR(30),
    STARTED_AT DATETIME,
    FOREIGN KEY (STAFF_LINK_ID) REFERENCES Staff(STAFF_ID)
);

INSERT INTO Positions VALUES
(1, 'Team Lead', '2017-02-01 00:00:00'),
(2, 'Coordinator', '2017-06-01 00:00:00'),
(8, 'Coordinator', '2017-06-01 00:00:00'),
(5, 'Team Lead', '2017-06-01 00:00:00'),
(4, 'Assistant Lead', '2017-06-01 00:00:00'),
(7, 'Coordinator', '2017-06-01 00:00:00'),
(6, 'Senior Analyst', '2017-06-01 00:00:00'),
(3, 'Senior Analyst', '2017-06-01 00:00:00');

--------------------------------------------------
-- QUERIES
--------------------------------------------------

-- 1
SELECT NAME AS EMPLOYEE_NAME FROM Staff;

-- 2
SELECT UPPER(NAME) FROM Staff;

-- 3
SELECT DISTINCT TEAM FROM Staff;

-- 4
SELECT * FROM Staff ORDER BY NAME;

-- 5
SELECT * FROM Staff ORDER BY NAME, TEAM DESC;

-- 6
SELECT * FROM Staff WHERE NAME IN ('Meena', 'Ramesh');

-- 7
SELECT * FROM Staff WHERE NAME NOT IN ('Meena', 'Ramesh');

-- 8
SELECT * FROM Staff WHERE TEAM = 'Support';

-- 9
SELECT * FROM Staff WHERE NAME LIKE '%a%';

-- 10
SELECT * FROM Staff WHERE NAME LIKE '_____a';

-- 11
SELECT * FROM Staff 
WHERE JOINED_ON BETWEEN '2015-03-01' AND '2015-03-31';

-- 12
SELECT NAME FROM Staff 
WHERE PAY BETWEEN 60000 AND 100000;

-- 13
SELECT * FROM Positions WHERE ROLE_NAME = 'Team Lead';

-- 14
SELECT * FROM Staff 
INNER JOIN Rewards 
ON Staff.STAFF_ID = Rewards.STAFF_LINK_ID;

-- 15
SELECT * FROM Staff WHERE STAFF_ID % 2 = 0;

-- 16
SELECT * FROM Staff LIMIT 6;