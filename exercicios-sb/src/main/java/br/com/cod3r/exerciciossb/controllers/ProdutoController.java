package br.com.cod3r.exerciciossb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.ProdutoModel;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // @PostMapping
    @RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
    public @ResponseBody ProdutoModel novoProduto(@Valid ProdutoModel produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    private Iterable<ProdutoModel> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<ProdutoModel> obterProdutosPorNome(@PathVariable String parteNome) {
        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }

    /*
     * @GetMapping(path = "/pagina/{numeroPagina}/qtdePagina")
     * public Iterable<ProdutoModel> obterProdutosPorPagina(@PathVariable int
     * numeroPagina, @PathVariable int qtdePagina) {
     * if (qtdePagina >= 5)
     * qtdePagina = 5;
     * Pageable page = PageRequest.of(numeroPagina, qtdePagina);
     * return produtoRepository.findAll(page);
     * }
     */

    @GetMapping(path = "/{id}")
    public Optional<ProdutoModel> obterProdutosPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

    /*
     * @PutMapping
     * public ProdutoModel alteraProduto(@Valid ProdutoModel produto) {
     * produtoRepository.save(produto);
     * return produto;
     * }
     */

    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }

}