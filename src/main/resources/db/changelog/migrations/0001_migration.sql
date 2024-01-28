-- liquibase formatted sql
-- changeset marcus:0001.1

create table tb_categories (id bigint not null auto_increment, description varchar(255), name varchar(255), primary key (id)) engine=InnoDB;
create table tb_products (price float(53), stock integer, category_id bigint, id bigint not null auto_increment, description varchar(255), name varchar(255), primary key (id)) engine=InnoDB;
