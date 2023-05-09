CREATE TABLE Cidade (
    id SERIAL PRIMARY KEY,
    nome TEXT NOT NULL,
    estado TEXT NOT NULL
);


select * from Cidade;


INSERT INTO Cidade (id, nome, estado) VALUES
(1, 'São Paulo', 'SP'),
(2, 'Rio de Janeiro', 'RJ'),
(3, 'Belo Horizonte', 'MG'),
(4, 'Porto Alegre', 'RS'),
(5, 'Brasília', 'DF'),
(6, 'Salvador', 'BA'),
(7, 'Curitiba', 'PR'),
(8, 'Fortaleza', 'CE'),
(9, 'Recife', 'PE'),
(10, 'Goiânia', 'GO');

UPDATE Cidade
SET nome = 'Ribeirão Preto', estado = 'SP'
WHERE id = 6;

DELETE FROM cidade 
WHERE id IN(7, 10);

DROP TABLE Cidade;