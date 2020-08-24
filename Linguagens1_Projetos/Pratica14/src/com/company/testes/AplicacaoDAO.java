package com.company.testes;

import com.company.dao.ProdutoDAO;
import com.company.models.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicacaoDAO {
    private List<Produto> produtos;
    private ProdutoDAO produtoDAO;
    private Scanner scanner;

    public AplicacaoDAO() {
        produtos = new ArrayList<>();
        produtoDAO = new ProdutoDAO();
        scanner = new Scanner(System.in);

    }

    public void run(){

    }
}
