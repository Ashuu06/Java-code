create database course;
use course;

/*Creating Table students*/
create table students(SNO int, SName varchar(20), Course varchar(10), Batch varchar(10), M1 int, M2 int, M3 int, TOTAL int, AVG int, RESULT varchar(10));
desc students;

/*Inserting values in the database*/
insert into students values (1,'SURYA','SQL','MOR', 65,66,70,null,null,null), (2,'NEHA','JAVA','EVE',45,35,56,null,null,null),(3,'JOSHI','JAVA','MOR',23,90,90,null,null,null), (4,'VARUN','CLANG','MOR',78,90,99,null,null,null), (5,'SASI','SQL','EVE',88,90,90,null,null,null), (6,'SHEWATA', 'SQL','EVE',88,90,90,null,null,null);
select * from students;

/*1)WRITE A QUERY TO UPDATE TOTAL BASED ON M1+M2+M3,AVG BASED ON
TOTAL/3,RESULT BASED ON M1&gt;40 AND M2&gt;40 ANDM3&gt;40 TO SET ‘PASS’
OTHERWISE ‘FAIL’.*/
UPDATE students SET TOTAL=M1+M2+M3 where SNO>0;
UPDATE students SET AVG = TOTAL/3 where SNO>0;
UPDATE students SET RESULT = CASE WHEN M1>40 and M2>40 and M3>40 THEN 'PASS' ELSE 'FAIL' END;


/*2)WRITE A QUERY TO UPDATE SNAMES FOR SNO IS 1 AND 5.*/
UPDATE students SET SName = 'ASHUTOSH' WHERE SNO=1;
UPDATE students SET SName = 'VIKAS' WHERE SNO=5;


/*3)WRITE A QUERY TO SELECT ALL STUDENTS DETAILS RESULT IS ‘PASS’ AND
COURSE SHOULD BE EQUAL TO ‘SQL’?*/
select * from students WHERE RESULT='PASS' and Course='SQL';


/*4)WRITE A QUERY TO SELECT WHICH STUDENTS MARKS BELOW 75 AND ABOVE 50.*/
SELECT * FROM students WHERE M1<75 AND M2<75 AND M3<75 AND M1>50 AND M2>50 AND M3>50;


/*5)WRITE A QUERY TO SELECT ALL STUDENTS WHICH NAME STARTS WITH ‘S’
LETTER AND ENDS WITH ‘A’?*/
select * from students WHERE SName LIKE 'S%A';


/*6)WRITE A QUERY TO GET ALL STUDENTS DETAILS WHICH STUDENT COURSE
IS ‘JAVA’,’CLANG’?*/
select * from students WHERE Course='JAVA' OR Course='CLANG';


/*7)WRITE A QUERY TO GET ALL COURSE DETAILS WHICH COURSE IS RUNNING
IN ‘MOR’ AND ‘EVE’ BATCHES?*/
select Batch,Course from students WHERE Batch = 'MOR' OR Batch ='EVE';


/*8)WRITE A QUERY TO GET COURSE DETAILS WHICH COURSE IS ONLY ‘MOR’
BUT NOT IN ‘EVE’ BATCH?*/
select Batch, Course from students WHERE batch = 'MOR' != 'EVE';









