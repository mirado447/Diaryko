do
$$
    begin
            if not exists(select from pg_type where typname = 'sex') then
    create type sex as enum ('M', 'F', 'OTHER');
end if;
    end
$$;

create table if not exists "user" (
    id varchar(100) primary key,
    firstname varchar(100),
    lastname varchar(100),
    email varchar(100),
    birthdate date,
    sex sex,
    password varchar(100)
    );