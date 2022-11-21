create database  booking;

use booking;

create table login(username varchar(25),password varchar(25));

insert into login values('admin','123');

select * from login;
show tables; 

create table customer(document varchar(20), number varchar(30),name varchar(30),gender varchar(15),country varchar(20),room varchar(10),checkintime varchar(80),deposit varchar(20));
select * from customer;
DROP TABLE customer;