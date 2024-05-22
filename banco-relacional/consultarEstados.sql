select * from estados;

select sigla, nome as 'Estado' from `estados`
where regiao = 'Nordeste';

select sigla, nome from estados
where populacao > 10
order by populacao desc;