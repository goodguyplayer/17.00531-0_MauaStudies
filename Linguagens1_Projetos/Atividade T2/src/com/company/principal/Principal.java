package com.company.principal;
import java.util.Scanner;

public class Principal {
    // Deve realizar o cadastro, apresentação de novos membros, mandar alguem embora, trocar jornada de trabalho, postar mensagems, sair do sistema

    // Segmento geral do menu
    private String menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema MAsK_S0c13ty");
        System.out.println("Favor escolher uma das seguintes opções.:");
        System.out.println("1 - Cadastrar novo h4ck3r");
        System.out.println("2 - H4ck3rs cadastrados");
        System.out.println("3 - Eliminar h4ck3r que fala muito");
        System.out.println("4 - Mudar horario");
        System.out.println("5 - Enviar mensagem para todos os h4ck3rs");
        System.out.println("6 - Sair por hoje");

        String escolha = input.nextLine();
        return escolha;
    }

    // O principal que roda tudo.
    public void run() {
        int exit = 0;
        while (exit == 0) {
            String escolha = menu();
            switch (escolha) {
                case "1":
                    System.out.println("Favor inserir os dados.");
                    break;
                case "2":
                    System.out.println("Todos os h4ck3rs cadastrados");
                    break;
                case "3":
                    System.out.println("Escolha o h4ck3r");
                    break;
                case "4":
                    System.out.println("Mudando horário");
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
        }
    }
}



