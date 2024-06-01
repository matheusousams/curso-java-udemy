package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.cod3r.exerciciossb.model.entities.ProdutoModel;

public interface ProdutoRepository extends CrudRepository<ProdutoModel, Integer> {

    public Iterable<ProdutoModel> findByNomeContainingIgnoreCase(String parteNome);

    @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
    public Iterable<ProdutoModel> searchByNameLike(@Param("nome") String nome);
}
