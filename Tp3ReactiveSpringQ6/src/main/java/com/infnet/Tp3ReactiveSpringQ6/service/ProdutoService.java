package com.infnet.Tp3ReactiveSpringQ6.service;

import com.infnet.Tp3ReactiveSpringQ6.model.Produto;
import com.infnet.Tp3ReactiveSpringQ6.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Flux<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Mono<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }

    public Mono<Produto> save(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Mono<Produto> update(Long id, Produto produtoAtualizado) {
        return produtoRepository.findById(id)
                .flatMap(existingProduto -> atualizarProduto(existingProduto, produtoAtualizado))
                .switchIfEmpty(Mono.error(new IllegalArgumentException("Produto não existe")));
    }

    private Mono<Produto> atualizarProduto(Produto produtoExistente, Produto produtoAtualizado) {
        produtoExistente.setNome(produtoAtualizado.getNome());
        produtoExistente.setPreco(produtoAtualizado.getPreco());
        return produtoRepository.save(produtoExistente);
    }

    public Mono<Void> deleteById(Long id) {
        return produtoRepository.deleteById(id);
    }
}
