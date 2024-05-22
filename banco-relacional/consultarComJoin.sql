select * from `estados` e, cidades c
where e.id = c.estado_id;

select e.id, e.nome, e.sigla, e.regiao, e.populacao, c.nome, c.area from `estados` e, cidades c
where e.id = c.estado_id

select
e.nome, e.regiao, c.nome
from estados e
inner join cidades c
on e.id = c.estado_id;