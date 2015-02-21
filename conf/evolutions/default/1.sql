# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table list_todo (
  id                        integer primary key AUTOINCREMENT,
  todo                      varchar(255),
  date                      varchar(255))
;




# --- !Downs

PRAGMA foreign_keys = OFF;

drop table list_todo;

PRAGMA foreign_keys = ON;

