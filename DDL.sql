create schema spring;

use spring;

create table tra_trabalho(
  tra_id bigint primary key auto_increment,
  tra_titulo varchar(100) not null unique,
  tra_data_hora_entrega datetime not null,
  tra_descricao varchar(200),
  tra_grupo varchar(20) not null,
  tra_nota int,
  tra_justificativa varchar(100)
);

insert into tra_trabalho(tra_titulo, tra_data_hora_entrega, tra_descricao, tra_grupo, tra_nota, tra_justificativa)
  values ('Teste', current_timestamp(), 'Descrito', 'AA', 10, 'Bom!');

insert into tra_trabalho(tra_titulo, tra_data_hora_entrega, tra_descricao, tra_grupo, tra_nota, tra_justificativa)
  values ('Teste 2', current_timestamp(), 'Descrito 2', 'BB', 5, 'Ruim!');