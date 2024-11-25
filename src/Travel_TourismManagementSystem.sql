create database travelmanagementsystem;
use travelmanagementsystem;

create table account(username varchar(20), name varchar(20), password varchar(20), security varchar(100), answer varchar(50));
show tables;

create table customer(username varchar(20), id varchar(30), number varchar(30), name varchar(30), gender varchar(20), country varchar(20), address varchar(50), phone varchar(30), email varchar(40));

create table bookpackage(username varchar(20), package varchar(30), persons varchar(30), id varchar(30), number varchar(30), phone varchar(20), price varchar(20));

create table hotel(name varchar(30), costperperson varchar(20), acroom varchar(20), foodincluded varchar(20));
insert into hotel values('Raddison Blue Hotel', '3400', '1000', '1700');
insert into hotel values('River View Hotel', '2400', '1600', '1000');
insert into hotel values('The Taj Hotel', '4800', '1290', '2900');

select * from hotel;

create table bookhotel(username varchar(20), name varchar(30), persons varchar(10), days varchar(10), ac varchar(10), food varchar(10), id varchar(20), number varchar(20), phone varchar(20), price varchar(20));
select * from bookhotel;