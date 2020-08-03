package com.company.implementacoes.serializacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TesteSerializar {
    public static void main(String[] args) {
        System.out.println("TEst");

        Pessoa p1 = new Pessoa("Murilo", 30);
        Pessoa p2 = new Pessoa("All might", 31);

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("ecm251.txt");

            // Creates object that makes conversion in bytes
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(p1);
            objectOutputStream.writeObject(p2);

            objectOutputStream.close();
            fileOutputStream.close();


        } catch (Exception exception){
            System.out.println("Something's wrong I can feel it");
            exception.printStackTrace();
        }

        System.out.println("Done");
    }
}
