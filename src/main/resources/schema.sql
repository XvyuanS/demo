drop database Billing;
create database billing default character set 'utf8';
use Billing;
create table manactor(
id          int(3) primary key auto_increment,
name        varchar(11)  not null,
stature         int(3) not null,
birthday    varchar(15) not null ,
production  varchar(50) not null
);
create table womanactor(
id          int(3) primary key auto_increment,
name        varchar(5) not null,
stature         int(3) not null,
birthday    varchar(15) not null,
production  varchar(50) not null
);