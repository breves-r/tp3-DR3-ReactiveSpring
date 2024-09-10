package com.infnet.Tp3ReactiveSpringQ6.repository;

import com.infnet.Tp3ReactiveSpringQ6.model.Produto;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface ProdutoRepository extends R2dbcRepository<Produto, Long> {
}
