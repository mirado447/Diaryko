create table if not exists photo(
    id varchar(100) primary key,
    name varchar(100),
    type_mime varchar(50),
    create_at date default current_date not null,
    file_size bigint,
    filepath varchar(250),
    id_journal varchar(100),
    constraint fk_journal foreign key (id_journal) references journal(id)
    );