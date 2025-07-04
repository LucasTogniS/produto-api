package com.example.produto_api.service;

import com.example.produto_api.model.Produto;
import com.example.produto_api.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public Optional<Produto> buscarPorId(String id) {
        return repository.findById(id);
    }

    public Produto atualizar(String id, Produto produto) {
        produto.setId(id);
        return repository.save(produto);
    }

    public void deletar(String id) {
        repository.deleteById(id);
    }
}