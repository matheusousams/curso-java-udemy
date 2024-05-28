package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.models.ClienteModel;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public ClienteModel obterClienteModel() {
        return new ClienteModel(30, "Valéria", "123.456.789-10");
    }

    @GetMapping("/{id}")
    public ClienteModel obterClientePorId(@PathVariable int id) {
        return new ClienteModel(id, "Joana", "111.222.444-33");
    }

    @GetMapping
    public ClienteModel obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new ClienteModel(id, "Carlos Eduardo", "010.100.011-00");
    }
}
