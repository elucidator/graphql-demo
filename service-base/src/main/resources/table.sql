create sequence hibernate_sequence start with 1 increment by 1

    create table WIDGET (
       id integer not null,
        uuid binary,
        value integer,
        primary key (id)
    );

