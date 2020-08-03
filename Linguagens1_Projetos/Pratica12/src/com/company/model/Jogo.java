package com.company.model;
import com.company.enums.Status;

public class Jogo {
    private String platform;
    private String nome;
    private Status status;

    public Jogo(String platform, String nome, Status status) {
        this.platform = platform;
        this.nome = nome;
        this.status = status;
    }

    
}
