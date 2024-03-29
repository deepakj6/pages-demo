DROP DATABASE IF EXISTS pages;

CREATE DATABASE pages;

USE pages;

create table pages(
  id bigint(20) not null auto_increment,
  business_name VARCHAR(50),
  address VARCHAR(50),
  category_id bigint(20),
  contact_number VARCHAR(50),

  primary key (id)
)
engine = innodb
default charset = utf8;