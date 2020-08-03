package com.company.implementacoes.arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class TesteEscrita {
    public static void main(String[] args) {
        // Cria um arquivo
        File file = new File("Name.txt");
        try {

            // Cria uma conexão para escrever no arquivo
            FileWriter fileWriter = new FileWriter(file);

            // Cria um buffer de writing
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escrever algo no arquivo
            bufferedWriter.write("Hello files\n");
            bufferedWriter.write("Hello cunts\n");
            bufferedWriter.write("2 + 2 = " + (2+2) + "\n");

            // Force immediate write
            // bufferedWriter.flush();

            // Fecha o buffer e escreve no arquivo
            bufferedWriter.close();

            // Fecha os demais fluxos
            fileWriter.close();


        } catch (Exception exception){
            System.out.println("Something's wrong, I can feel it");
            exception.printStackTrace();
        }

    }
}
