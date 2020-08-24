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

    private void deletarProduto(){
        System.out.println("Código do produto");
        String code = scanner.next();
        Produto produto = new Produto(code);
        produtoDAO.delete(produto);
    }

    private void exibirProdutos() {
        produtos = produtoDAO.getAll();
        System.out.println("Produto:");
        produtos.forEach( produto -> System.out.println(produto));
    }

    private void cadastrarProduto() {
        String nome, codigo, descricao;
        int quantidade;
        double custo, valor;
        System.out.println("Informe os dados:");
        System.out.println("codigo");
        codigo = scanner.next();
        System.out.println("Nome");
        nome = scanner.next();
        System.out.println("Descricao");
        descricao = scanner.next();
        System.out.println("Custo");
        custo = Double.parseDouble(scanner.next());
        System.out.println("Valor");
        valor = Double.parseDouble(scanner.next());
        System.out.println("Quantidade");
        quantidade = Integer.parseInt(scanner.next());
        produtoDAO.create(new Produto(
                codigo, nome, descricao, custo, valor, quantidade
        ));
    }

    private void atualizarProduto() {
        produtos = produtoDAO.getAll();
        System.out.println("Codigo do Produto para Atualizar:");
        String codigo = scanner.next();
        System.out.println("Cadastre os novos valores:");
        String nome, descricao;
        int quantidade;
        double custo, valor;
        System.out.println("Informe os dados:");
        nome = scanner.next();
        descricao = scanner.next();
        custo = Double.parseDouble(scanner.next());
        valor = Double.parseDouble(scanner.next());
        quantidade = Integer.parseInt(scanner.next());
        produtoDAO.update(new Produto(
                codigo, nome, descricao, custo, valor, quantidade
        ));
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
                    break;
                case 2:
                    deletarProduto();
                    break;
                case 3:
                    atualizarProduto();
                    break;
                case 4:
                    cadastrarProduto();
                    break;
                default:
                    System.out.println("Input não reconhecido");
                    break;
            }
        } while (alive);
    }



    private void menu(){
        System.out.println("PLUG_AND_USE-1996");
        System.out.println("1 - Produtos cadastrados");
        System.out.println("2 - Deletar produtos");
        System.out.println("3 - Alterar produtos");
        System.out.println("4 - Cadastrar produto");
        System.out.println("0 - Sair");
    }
}
