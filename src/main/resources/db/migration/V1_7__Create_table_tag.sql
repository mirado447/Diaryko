create table if not exists tag(
    id varchar(100) primary key,
    tag_name varchar(100),
    id_category varchar(100),
    constraint fk_category foreign key (id_category) references tag_categories(id)
    );