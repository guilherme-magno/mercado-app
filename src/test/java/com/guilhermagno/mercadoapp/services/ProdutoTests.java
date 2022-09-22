package com.guilhermagno.mercadoapp.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.guilhermagno.mercadoapp.model.Produto;
import com.guilhermagno.mercadoapp.service.ProdutoService;
// import com.guilhermagno.mercadoapp.service.ProdutoServiceImpl;

@SpringBootTest
@ActiveProfiles("test")
public class ProdutoTests {

    @Autowired
    private ProdutoService service;
    // private static ProdutoServiceImpl service;
    private static Integer idFound = 1;
    private static Integer idNotFound = 100;
    private static Produto newProduct;
    private static Produto createdProduct;

    @BeforeAll
    public static void setup() {
        System.out.println("Configurando parametros de testes");
        newProduct = new Produto();
        newProduct.setNome("Bolacha");

        createdProduct = new Produto();
        createdProduct.setId(1);
        createdProduct.setNome("Bolacha");

        /* service = Mockito.mock(ProdutoServiceImpl.class);
        Mockito.when(service.criarNovoProduto(newProduct)).thenReturn(new Produto());
        Mockito.when(service.buscarPorId(idFound)).thenReturn(createdProduct);
        Mockito.when(service.buscarPorId(idNotFound)).thenReturn(null);
        Mockito.when(service.buscarPorPalavraChave("b")).thenReturn(new ArrayList<Produto>());
        Mockito.when(service.listarTodos()).thenReturn(new ArrayList<Produto>());
        Mockito.when(service.alterarProduto(createdProduct)).thenReturn(createdProduct); */
    }

    @Test
    public void shouldStoreProduct() {
        System.out.println("testando método shouldStoreProduct - criarNovoProduto()");

        Produto p = new Produto();
        p.setNome("BOLACHA");

        assertNotNull(service.criarNovoProduto(newProduct));
    }

}
