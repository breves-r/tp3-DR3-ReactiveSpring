package com.infnet.Tp3ReactiveSpringQ5.controller;

import com.infnet.Tp3ReactiveSpringQ5.model.Fornecedor;
import com.infnet.Tp3ReactiveSpringQ5.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fornecedores")
public class FornecedorController {
    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping
    public Iterable<Fornecedor> listarFornecedores() {
        return fornecedorService.getAll();
    }

    @GetMapping("/{id}")
    public Fornecedor buscarPorId(@PathVariable Long id) {
        return fornecedorService.getById(id);
    }

    @PostMapping
    public Fornecedor adicionarFornecedor(@RequestBody Fornecedor fornecedor) {
        return fornecedorService.save(fornecedor);
    }

    @PutMapping("/{id}")
    public Fornecedor alterarFornecedor(@PathVariable Long id, @RequestBody Fornecedor fornecedor) {
        return fornecedorService.update(id, fornecedor);
    }

    @DeleteMapping("/{id}")
    public void deletarFornecedor(@PathVariable Long id) {
        fornecedorService.deleteById(id);
    }
}
