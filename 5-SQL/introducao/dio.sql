CREATE TABLE pessoas (
    id INT NOT NULL PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(30) NOT NULL,
    nascimento DATE
)

INSERT INTO pessoas
    (nome, nascimento)
VALUES
    ('Odeir', '1990/06/21')

INSERT INTO pessoas
    (nome, nascimento)
VALUES
    ('Saimon', '1990/06/27')

INSERT INTO pessoas
    (nome, nascimento)
VALUES
    ('Vinícius', '1990/03/24')