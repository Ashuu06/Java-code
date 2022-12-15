create database hibernatelab
use hibernatelab
create table Books(BookId int,BName varchar(25),Price int)
insert into Books values(1,'Java',1000),(2,'Python',700),(3,'PHP',600),(4,'SQL',500)
select * from Books