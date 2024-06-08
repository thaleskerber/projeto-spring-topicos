create schema spring;

use spring;

create table cor_corpo (
cor_id bigint primary key auto_increment,
cor_nome varchar(100) not null unique,
cor_descricao varchar(200) not null,
cor_raio int,
cor_distancia_estrela float not null);

insert into cor_corpo(cor_nome, cor_descricao, cor_raio, cor_distancia_estrela) values ('Terra', 'terceiro planeta', 6371, 1), ('Marte', 'quarto planeta', null, 1.5);

create table bal_balanco (
  bal_id bigint unsigned not null auto_increment,
  bal_desc varchar(256) not null,
  bal_data_hora datetime not null,
  bal_valor numeric(10,2) not null,
  primary key (bal_id)
);

insert into bal_balanco(bal_desc, bal_data_hora, bal_valor)
  values('Supermercado', '2024-03-16 10:25', -221.45);
insert into bal_balanco(bal_desc, bal_data_hora, bal_valor)
  values('Salário', '2024-03-18 07:00', 4230.70);