create sequence hibernate_sequence start with 1 increment by 1;

create table BOOK (
                      id bigint not null,
                      author varchar(255),
                      description varchar(255),
                      title varchar(255),
                      primary key (id)
);

create table REVIEW (
                        id bigint not null,
                        author varchar(255),
                        comments varchar(255),
                        rating integer not null,
                        primary key (id)
);

alter table REVIEW
    add constraint FKst0n2psygjelocks2h2yxbpd6
        foreign key (id)
            references BOOK


