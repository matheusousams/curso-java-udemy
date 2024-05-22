insert into prefeitos
    (nome, cidade_id)
values
    ('Sarto', (select c.id from cidades c where c.nome = 'Fortaleza'))

insert into prefeitos
    (nome, cidade_id)
value
    ('Maria', null)