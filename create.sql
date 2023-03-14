create sequence account_settings_seq start with 1 increment by 50;
create sequence accounts_seq start with 1 increment by 50;
create table account_settings (id bigint not null, name varchar(255) not null, value varchar(255) not null, account_id bigint not null, primary key (id));
create table accounts (id bigint not null, email_address varchar(255), name varchar(100) not null, primary key (id));
alter table account_settings add constraint FK54uo82jnot7ye32pyc8dcj2eh foreign key (account_id) references accounts;
