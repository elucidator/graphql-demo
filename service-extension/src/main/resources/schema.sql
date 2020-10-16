create sequence hibernate_sequence start with 1 increment by 1;

create table ORDER_INFO (
                            id bigint not null,
                            externalId integer not null,
                            isbn varchar(255),
                            price bigint not null,
                            provider varchar(255),
                            time bigint not null,
                            primary key (id)
)
