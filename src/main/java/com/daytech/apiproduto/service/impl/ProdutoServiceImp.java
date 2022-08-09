package com.daytech.apiproduto.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.daytech.apiproduto.entity.Produto;
import com.daytech.apiproduto.repository.ProdutoRepository;
import com.daytech.apiproduto.service.ProdutoService;

@Service
public class ProdutoServiceImp implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImp(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> buscarTodos() {
        // TODO Auto-generated method stub
        return produtoRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        try {
            produtoRepository.deleteById(id);

        } catch (Exception e) {
            throw new RuntimeException("correu um erro ao excluir");
            // TODO: handle exception
        }
        // TODO Auto-generated method stub

    }

    @Override
    public Produto save(Produto produto) {
        // TODO Auto-generated method stub
        return produtoRepository.save(produto);
    }

}
