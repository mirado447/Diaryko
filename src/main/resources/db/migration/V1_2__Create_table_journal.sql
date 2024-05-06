create table if not exists journal (
    id varchar(100) primary key,
    create_at date default current_date not null,
    update_at date default current_date,
    title varchar(100),
    content text,
    id_user varchar(100),
    constraint fk_user foreign key (id_user) references "user"(id)
    );