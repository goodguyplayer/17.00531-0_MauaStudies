package com.company.principal;
import com.company.enums.Membro;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    // Deve realizar o cadastro, apresentação de novos membros, mandar alguem embora, trocar jornada de trabalho, postar mensagems, sair do sistema

    // Guardar todos os membros registrados
    private ArrayList<String> hackers = new ArrayList<String>();

    // Enum - Membros
    Membro membro;

    // User input
    Scanner input = new Scanner(System.in);

    // Segmento geral do menu
    private String menu() {
        System.out.println("Bem vindo ao sistema MAsK_S0c13ty");
        System.out.println("Escolha uma das seguintes opções.:");
        System.out.println("1 - Cadastrar novo h4ck3r");
        System.out.println("2 - H4ck3rs cadastrados");
        System.out.println("3 - Eliminar h4ck3r que fala muito");
        System.out.println("4 - Mudar horario");
        System.out.println("5 - Enviar mensagem para todos os h4ck3rs");
        System.out.println("6 - Sair por hoje");

        String escolha = this.input.nextLine();
        return escolha;
    }

    // Método cadastro.: Recebe nome, email, enum tipo.
    private String cadastro(){
        // Username
        System.out.println("Digitar o nome do h4ck3r.:");
        String nome = this.input.nextLine();

        // User email
        System.out.println("Digitar o email do h4ck3r.:");

        // User type
        String email = this.input.nextLine();
        System.out.println("Qual o tipo?");
        System.out.println("1 - Mobile Members");
        System.out.println("2 - Heavy Lifters");
        System.out.println("3 - Script Guys");
        System.out.println("4 - Big Brothers");
        String type = this.input.nextLine();
        switch (type){
            case "1":
                membro = membro.MOBILE_MEMBERS;
                break;
            case "2":
                membro = membro.HEAVY_LIFTERS;
                break;
            case "3":
                membro = membro.SCRIPT_GUYS;
                break;
            case "4":
                membro = membro.BIG_BROTHERS;

        }

        return (nome + ";" +  email + ";" + membro);
    }

    // Método usuários.: "get" de todos os usuários/Hackers cadastrados. Ou h4ck3rs
    private void usuarios(){
        for (String hacker: this.hackers) {
            String[] dados = hacker.split(";");
            System.out.println( "H4ck3r.: " + dados[0] + " " +
                                "E-mail.: " + dados[1] + " " +
                                "Classe.: " + dados[2]);
        }

    }

    // O principal que roda tudo.
    public void run() {
        int exit = 0;
        while (exit == 0) {
            String escolha = menu();
            switch (escolha) {
                case "1":
                    System.out.println("Favor inserir os dados.");
                    hackers.add(cadastro());
                    System.out.println("H4ck3r cadastrado com sucesso.");
                    break;

                case "2":
                    System.out.println("Todos os h4ck3rs cadastrados.:");
                    usuarios();
                    break;

                case "3":
                    System.out.println("Escolha o h4ck3r");
                    break;

                case "4":
                    System.out.println("Mudando horário");
                    break;

                case "5":
                    System.out.println("Enviando mensagem geral. Relatório de mensagems enviadas.:");
                    break;

                case "6":
                    System.out.println("Saindo...");
                    exit += 1;
                    break;

                default:
                    System.out.println("Input detectado não reconhecido. Favor tentar novamente.");
                    break;
            }
            System.out.println(" Voltando ao menu...");
        }
    }
}



