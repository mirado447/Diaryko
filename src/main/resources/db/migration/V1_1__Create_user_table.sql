create table if not exists "user" (
    id varchar(100) primary key,
    firstname varchar(100),
    lastname varchar(100),
    email varchar(100),
    birthdate date,
    sex varchar(20),
    password varchar(100)
    );