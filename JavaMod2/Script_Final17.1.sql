CREATE TABLE paciente (
id INT PRIMARY KEY,
nome VARCHAR(256) NOT NULL,
email VARCHAR(256) NOT NULL,
telefone VARCHAR(16),
endereco VARCHAR(256) NOT NULL,
doenca VARCHAR(256) NOT NULL,
temPlanoDeSaude BOOLEAN NOT NULL,
diasDeInternacao INT,
numeroDoQuarto INT
);

CREATE SEQUENCE paciente_seq;

CREATE TABLE visitante (
id INT PRIMARY KEY,
nome VARCHAR(256) NOT NULL,
email VARCHAR(64) NOT NULL,
telefone VARCHAR(16),
endereco VARCHAR(256) NOT NULL,
paciente VARCHAR(256) NOT NULL
);

CREATE SEQUENCE visitante_seq;

CREATE TABLE medico (
id INT PRIMARY KEY,
nome VARCHAR(256) NOT NULL,
email VARCHAR(64) NOT NULL,
telefone VARCHAR(16),
endereco VARCHAR(256) NOT NULL,
especialidade VARCHAR(256) NOT NULL,
horasMensais INT,
valorDasHoras INT
);

CREATE SEQUENCE medico_seq;

CREATE TABLE enfermeiro (
id INT PRIMARY KEY,
nome VARCHAR(256) NOT NULL,
email VARCHAR(64) NOT NULL,
telefone VARCHAR(16),
endereco VARCHAR(256) NOT NULL,
horasMensais INT,
valorDasHoras INT
);

CREATE SEQUENCE enfermeiro_seq;



insert into enfermeiro 

values(1,'Clayton Souza','claytons@hotmail.com','(16)3854-6740','Av. Dr. Alves - Centro - São Paulo', 44, 6);


insert into enfermeiro 

values(2,'Max Olindo','max@hotmail.com','(17)4456-3259','Rua josé Bonifácio - Centro - São Paulo', 44, 6);


insert into enfermeiro
 
values(3,'Gustavo Ferreira','gferreira@gmail.com','(12)3387-3251','Av. 7 de setembro - Centro - Rio de Janeiro', 44, 10);


insert into enfermeiro 

values(4,'José Aleixo','aleixo2014@gmail.com','(16)2355-6230','Rua São João - Jd. Sol - São Paulo', 44, 12);


insert into enfermeiro 

values(5,'Mauricio Morais','mmorais@hotmail.com','(16)3854-4342','Rua São João - Jd. Sol - São Paulo', 44, 9);







insert into medico

values(1,'Tamires da Silva','tamysilva@hotmail.com','(16)3940-5250','Rua Augusta - Centro - São Paulo','Clínico Geral', 44, 86);


insert into medico

values(2,'Paulo Cesar','paulocesar4@gmail.com','(16)3854-3430','Rua Toquio - Portal Luz - São Paulo','Clínico Geral', 44, 86);


insert into medico

values(3,'Ana Paula Silva','anaahpaula@hotmail.com','(16)3854-1212','Rua Luis Alberto - Vila Aparecida - São Paulo','Neurologista', 44, 120);


insert into medico

values(4,'Juliana Campos','jucampos123@hotmail.com','(16)3854-7976','Rua São João - Jd. Sol - São Paulo','Cardiologista', 44, 120);


insert into medico

values(5,'Carla Salles','carlasalles75@hotmail.com','(16)3854-8953','Rua Paulino - Centro - São Paulo','Clínico Geral', 44, 86);






insert into paciente

values(1,'Luis Fernando Junior','luis1234@hotmail.com','(16)3421-3232','Rua Barbieri- Vila Mariana - São Paulo','Virose',false, 4, 40);


insert into paciente

values(2,'Joice Costa','joicec@bol.com','(16)3421-3233','Av. Independência- Jd. Juninho - São Paulo','Bronquite',true, 2, 102);


insert into paciente

values(3,'Adriano Marcos','adrianomarcos1990@gmail.com','(16)3444-3221','Av. 7 de setembro- Vila Oeste - São Paulo','Gripe',false, 1, 190);


insert into paciente

values(4,'Rodolfo Matos','rodmatos@terra.com','(16)3421-4790','Av. Jorge Mendonça- Rua José Bonifacio - São Paulo','Virose',true, 2, 439);


insert into paciente

values(5,'Edcarlos Macedo','ed2014macedo@hotmail.com','(16)3444-4324','Av. Campos Salles- Centro - Santo André','Gripe',true, 1, 202);






insert into visitante

values(1,'José Roberto','jjroberto2@hotmail.com','(16)6544-4543','Rua Padre Nelson- Centro - São Paulo','Joice Costa');


insert into visitante

values(2,'Edson Araujo','ed2araujo@bol.com','(16)6544-5345','Rua Gustavo Mello- Centro - São Paulo','Adriano Marcos');


insert into visitante

values(3,'Anderson Oliveira','andoliveira@hotmail.com','(16)6544-1218','Rua Alberto Alves- Centro - São Paulo','Rodolfo Matos');


insert into visitante

values(4,'Diva Calijuri','diva2014@hotmail.com','(16)6544-8548','Rua Campos do Jordão - Vila Albertina - São Caetano','Edcarlos Macedo');


insert into visitante

values(5,'Bruna Juares','bruna14juares@gmail.com','(16)6544-9787','Rua J Junior- Vila Mariana - São Paulo','Luis Fernando Junior');

