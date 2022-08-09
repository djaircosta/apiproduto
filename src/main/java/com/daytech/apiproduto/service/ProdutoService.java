package com.daytech.apiproduto.service;

import java.util.List;

import com.daytech.apiproduto.entity.Produto;

public interface ProdutoService {
    List<Produto> buscarTodos();

    Produto save(Produto produto);

    void delete(Long id);

}