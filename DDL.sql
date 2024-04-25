create schema spring;

use spring;

create table cor_corpo (
cor_id bigint primary key auto_increment,
cor_nome varchar(100) not null unique,
cor_descricao varchar(200) not null,
cor_raio int,
cor_distancia_estrela float not null);

insert into cor_corpo(cor_nome, cor_descricao, cor_raio, cor_distancia_estrela) values ('Terra', 'terceiro planeta', 6371, 1), ('Marte', 'quarto planeta', null, 1.5);


select * from cor_corpo;