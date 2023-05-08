create table veiculo
(id int primary key,
nome varchar(256) not null,
tipo varchar(64) not null,
marca varchar(64) not null,
modelo varchar(64));

insert into usuario(
id, nome, idade)
values 
(2, 'João', 60);

insert into usuario(
id, nome, idade)
values 
(3, 'Maria', 18);

insert into usuario(
id, nome, idade)
values 
(3, 'José', 28);



insert into veiculo(
id, nome, tipo, marca, modelo)
values 
(1, 'Stilo', 'Carro', 'Fiat', '2011' );

insert into veiculo(
id, nome, tipo, marca, modelo)
values 
(2, 'CB300r', 'Moto', 'Honda', '2013' );

select * from veiculo;

SELECT * from usuario;

SELECT * FROM usuario WHERE nome='Maria';

SELECT * FROM usuario WHERE idade>=21;

UPDATE usuario SET nome='Benedito' WHERE id=1;

SELECT * FROM usuario WHERE id=1;

DELETE FROM usuario WHERE id=1;

DROP TABLE usuario;

DROP TABLE veiculo;
