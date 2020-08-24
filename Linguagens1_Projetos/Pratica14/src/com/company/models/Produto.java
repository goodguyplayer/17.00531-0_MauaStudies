package com.company.models;

public class Produto {
    private String codigo;
    private String nome;
    private String descricao;
    private double custo;
    private double valor;
    private int quantidade;

    public Produto(String codigo, String nome, String descricao, double custo, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.custo = custo;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", custo=" + custo +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
