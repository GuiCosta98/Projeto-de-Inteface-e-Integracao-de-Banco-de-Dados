CREATE TABLE tb_carros (
idCarro INT NOT NULL AUTO_INCREMENT,
fabricante VARCHAR(32) NULL,
modelo VARCHAR(45) NULL,
anoFabricacao INT NULL,
cor VARCHAR(16) NULL,
km DECIMAL(8,2) NULL,
valor DECIMAL(10,2) NULL,
PRIMARY KEY (idCarro));



/* como boas práticas, sempre colocar os comandos do workbench
em maiusculo e os atributos em minusculo */

INSERT INTO tb_carros (fabricante, modelo, anoFabricacao, cor,
km, valor) VALUES ('Audi', 'R8', 2017, 'Azul', 0, 100000);

INSERT INTO tb_carros (fabricante, modelo, anoFabricacao, cor,
km, valor) VALUES ('BMW', '325i', 2015, 'Branco', 15000,
250000);

INSERT INTO tb_carros (fabricante, modelo, anoFabricacao, cor,
km, valor) VALUES ('Volvo', 'v200', 2019, 'Preto', 50000,
265000);

select * from tb_carros;




