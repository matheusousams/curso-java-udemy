insert into cidades (nome, area, estado_id)
values ('Fortaleza', 313.80, 
    (select id from estados where sigla = 'CE')
)