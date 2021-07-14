create schema sales;

create table sales.department(
   id int,
   name varchar(100) not null,
   primary key(id)
);

create table sales.employee(
   id int generated always as identity,
   name varchar(100) not null,
   address varchar(100) default null,
   email varchar(100) default null,
   id_department int  not null,
   foreign key (id_department) references sales.department(id),
   primary key(id)
);