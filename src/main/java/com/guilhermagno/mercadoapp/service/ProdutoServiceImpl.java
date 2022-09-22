package com.guilhermagno.mercadoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.guilhermagno.mercadoapp.model.Produto;
import com.guilhermagno.mercadoapp.repository.ProdutoRepository;

@Component
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto criarNovoProduto(Produto prod) {
        
        return produtoRepository.save(prod);
    }

    @Override
    public Produto alterarProduto(Produto prod) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Produto> listarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Produto> buscarPorPalavraChave(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Produto buscarPorId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
    

}
