#1
create table cqupt_student(studentid Varchar(10),
                            name Varchar(20),
                            sex Varchar(2),
                            age Integer,
                            Free DECIMAL(10,2),
                            adress Varchar(50),
                            memo Varchar(300)) ;

#2
create table CourseAa(Aa1 Varchar(20),
Aa2 int,
Aa3 decimal(10));

#3
create table ChooseBb(Bb1 Varchar(30),
Aa2 int,
Aa3 decimal(6));

#4
ALTER TABLE chooseBb ADD Bb4 VARCHAR(20) DEFAULT '系统测试值' NOT NULL;

#5
ALTER TABLE chooseBb ADD Bb5 VARCHAR(10) PRIMARY KEY;

#6
CREATE VIEW view_chooseBb(view_bb1,view_bb2,view_bb3) AS SELECT Bb1,Bb4,Bb5 FROM chooseBb;

#7
DROP VIEW view_chooseBb;

#8
CREATE INDEX Index_bb2 ON ChooseBb(bb2 ASC);
CREATE INDEX Index_bb4 ON ChooseBb(bb4,DESC);

#9
DROP INDEX Index_bb2 ON choosebb;

#10
CREATE TABLE test(
NAME VARCHAR(20) NOT NULL,
age INT NOT NULL,
score NUMERIC(10,2) NOT NULL,
address VARCHAR(60) NOT NULL);

#11
INSERT INTO test
(NAME,age,score,address)
VALUES
('赵一',20,580.00,'重邮宿舍 12-3-5'),
('钱二',19,540.00,'南福苑 5-2-9'),
('孙三',21,555.00,'学生新区 21-5-15'),
('李四',22,505.00,'重邮宿舍 8-6-22'),
('周五',20,495.00,'学生新区 23-4-8'),
('吴六',19,435.00,'南福苑 2-5-12');

#12
CREATE TABLE test_TEMP(
NAME VARCHAR(20) NOT NULL,
age INT NOT NULL,
score NUMERIC(10,2) NOT NULL,
address VARCHAR(60) NOT NULL);

#13
INSERT INTO test_TEMP
(NAME,age,score,address)
VALUES
('郑七',21,490.50,'重邮宿舍 11-2-1'),
('张八',20,560.00,'南福苑 3-3-3'),
('王九',10,515.00,'学生新区 19-7-1');

#14
INSERT INTO test SELECT * FROM test_TEMP;

#15
UPDATE test SET Score = score+5 WHERE  age<=20;

#16
UPDATE test SET age = age-1 WHERE address LIKE '%南福苑%';

#17
DELETE FROM test WHERE age >=21 AND score >= 500;

#18
DELETE FROM test WHERE score <=550 AND address LIKE '%重邮宿舍%';

#19
CREATE TABLE Student(
SN0 VARCHAR(20) NOT NULL,
NAME VARCHAR(10) NOT NULL,
age INT NOT NULL,
college VARCHAR(30) NOT NULL);

#20
CREATE TABLE Course(
courseId VARCHAR(15),
coursename VARCHAR(30) NOT NULL,
coursebeforeID VARCHAR(15) NOT NULL);

#21
CREATE TABLE Choose(
SN0 VARCHAR(20) NOT NULL,
courseId VARCHAR(30) NOT NULL,
score DECIMAL(5,2) NOT NULL);

#22
INSERT INTO Student
(SN0,NAME,age,college)
VALUES
('S00001','张三',20,'计算机学院'),
('S00002','李四',19,'通信学院'),
('S00003','王五',21,'计算机学院');

#23
INSERT INTO course
(courseid,coursename,coursebeforeid)
VALUES
('C1','计算机导论',null),
('C2','C语言','C1'),
('C3','数据结构','C2');

#24
INSERT INTO choose
(SN0,CourseID,score)
VALUES
('S00001','C1',95),
('S00001','C2',80),
('S00001','C3',84),
('S00002','C1',80),
('S00002','C2',85),
('S00003','C1',78),
('S00003','C3',70);

#25
SELECT SN0 AS 学号,NAME AS 姓名 FROM student WHERE college LIKE '%计算机学院%';

#26
SELECT * FROM student WHERE age BETWEEN 20 AND 23;

#27
SELECT COUNT(NAME) FROM student;

#28
SELECT MAX(score) FROM choose;
SELECT MIN(score) FROM choose;
SELECT SUM(score) FROM choose;
SELECT AVG(score) FROM choose;

#29
SELECT courseid,coursename FROM course WHERE courseid ISNULL;

#30
SELECT * FROM student,choose WHERE student.`SN0`=choose.`SN0`;

#31
SELECT * FROM student a WHERE EXISTS ( SELECT *FROM student b WHERE b.name='张三'AND b.college=a.college);

#32
SELECT
	SN0,score
FROM
	choose
WHERE
	courseid = 'C1' AND score<ANY(SELECT score
	FROM student,choose
	WHERE student.`SN0` = choose.`SN0`
	AND courseid = 'C1'
	AND NAME = '张三');

#33
SELECT Sn0
FROM choose
WHERE courseid = 'C1'
UNION
SELECT SN0 FROM choose
WHERE courseid= 'C3';

#34
SELECT DISTINCT SN0
FROM student
WHERE Sn0 IN(SELECT Sn0 FROM choose WHERE courseid = 'C1')
UNION
SELECT DISTINCT sn0
FROM student
WHERE sn0 IN(SELECT Sn0 FROM choose WHERE courseid = 'C3')