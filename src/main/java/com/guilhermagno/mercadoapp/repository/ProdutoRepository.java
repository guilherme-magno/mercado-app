package com.guilhermagno.mercadoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.guilhermagno.mercadoapp.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
    
}
