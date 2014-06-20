# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table receipt (
  id                        bigint not null,
  name                      varchar(255),
  attachment                bytea,
  constraint pk_receipt primary key (id))
;

create sequence receipt_seq;




# --- !Downs

drop table if exists receipt cascade;

drop sequence if exists receipt_seq;

