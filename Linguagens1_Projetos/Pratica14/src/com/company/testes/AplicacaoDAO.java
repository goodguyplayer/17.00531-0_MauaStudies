package com.company.testes;

import com.company.dao.ProdutoDAO;
import com.company.models.Produto;

import java.util.List;

public class AplicacaoDAO {
    public void run(){
        List<Produto> produtos;
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtos = produtoDAO.getAll();
        produtos.forEach(produto -> System.out.println(produto));
    }
}
