package com.guilhermagno.mercadoapp.service;

import java.util.List;

import com.guilhermagno.mercadoapp.model.Produto;

public interface ProdutoService {

    public Produto criarNovoProduto(Produto prod);

    public Produto alterarProduto(Produto prod);

    public List<Produto> listarTodos();

    public List<Produto> buscarPorPalavraChave(String key);

    public Produto buscarPorId(Integer id);

}
