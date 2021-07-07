create table sales.employee(
   id int generated always as identity,
   name varchar(100) not null,
   address varchar(100) default null,
   email varchar(100) default null,
   primary key(id)
);