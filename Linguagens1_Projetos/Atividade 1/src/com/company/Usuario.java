package com.company;

public class Usuario {
    //Nome = Nathan Brito da Silva;
    //RA = 17.00531-0;
    private String nome, senha, email;

    public Usuario(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
