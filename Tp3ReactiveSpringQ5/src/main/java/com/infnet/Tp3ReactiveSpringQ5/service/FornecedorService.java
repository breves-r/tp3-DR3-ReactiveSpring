package com.infnet.Tp3ReactiveSpringQ5.service;

import com.infnet.Tp3ReactiveSpringQ5.model.Fornecedor;
import com.infnet.Tp3ReactiveSpringQ5.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Iterable<Fornecedor> getAll() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor getById(Long id) {
        checkFornecedorExists(id);
        return fornecedorRepository.findById(id).get();
    }

    public Fornecedor save(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Fornecedor update(Long id, Fornecedor fornecedor) {
        checkFornecedorExists(id);
        fornecedor.setId(id);
        return fornecedorRepository.save(fornecedor);
    }

    public void deleteById(Long id) {
        checkFornecedorExists(id);
        fornecedorRepository.deleteById(id);
    }

    public void checkFornecedorExists(Long id) {
        if (!fornecedorRepository.existsById(id)) throw new IllegalArgumentException("Fornecedor não encontrado");
    }
}
