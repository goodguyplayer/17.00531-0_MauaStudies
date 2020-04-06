package com.company;

public class Main {

    public static void main(String[] args) {
        //Nome = Nathan Brito da Silva;
        //RA = 17.00531-0;
        Usuario usuario = new Usuario("Nathan");
        Contas c1 = new Contas(usuario);
        System.out.println(c1.getUsuario().getNome());
    }
}
