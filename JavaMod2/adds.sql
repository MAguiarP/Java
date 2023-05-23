UPDATE produtos (*, quantidade, descricao, nome)
VALUES (7, 20, 'Televisor, trasmite canais abertos e pagos.', 'TV');


select * from produtos;


UPDATE produtos
SET descricao = 'Televisor, trasmite canais abertos e pagos.'
WHERE id = 7;




INSERT INTO produtos ( id , quantidade, descricao, nome)
VALUES (8, 20, 'Computador, Usado para mais diversas tarefas e jogos.', 'PC');


INSERT INTO produtos ( id , quantidade, descricao, nome)
VALUES (9, 80, 'Notebook, Computador portátil, para diversas tarefas online', 'Notebook');


INSERT INTO produtos ( id , quantidade, descricao, nome)
VALUES (10, 50, 'Mouse, Usado para movimentar o cursos do mouse em um pc ou notebook', 'Mouse');