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

    private void exibirProdutos() {
        produtos = produtoDAO.getAll();
        System.out.println("Produto:");
        produtos.forEach( produto -> System.out.println(produto));
    }

    public void run(){
        boolean alive = true;
        do {
            menu();
            int opcao = Integer.parseInt(scanner.next());

            switch (opcao){
                case 0:
                    alive = false;
                    break;
                case 1:
                    exibirProdutos();

            }
        } while (alive);
    }

    private void menu(){
        System.out.println("PLUG_AND_USE-1996");
        System.out.println("1 - Produtos cadastrados");
        System.out.println("2 - Deletar produtos");
        System.out.println("3 - Alterar produtos");
        System.out.println("4 - Proutos cadastrados");
        System.out.println("0 - Sair");
    }
}
