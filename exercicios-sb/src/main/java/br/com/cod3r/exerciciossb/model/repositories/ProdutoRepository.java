package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.cod3r.exerciciossb.model.entities.ProdutoModel;
import java.util.List;

public interface ProdutoRepository extends CrudRepository<ProdutoModel, Integer> {

    public Iterable<ProdutoModel> findByNomeContainingIgnoreCase(String parteNome);
}
