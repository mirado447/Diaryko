create table if not exists journal_tags(
    id varchar(100) primary key,
    id_tag varchar(100),
    id_journal varchar(100),
    constraint fk_tag foreign key (id_tag) references tag(id),
    constraint fk_journal foreign key (id_journal) references journal(id)
    );