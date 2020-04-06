package com.company;

public class Usuario {
    //Nome = Nathan Brito da Silva;
    //RA = 17.00531-0;

    //Variables
    private String nome, senha, email;

    // set username
    public Usuario(String nome){
        this.nome = nome;
    }

    // getName
    public String getNome() {
        return nome;
    }

    // getEmail
    public String getEmail() {
        return email;
    }
}
