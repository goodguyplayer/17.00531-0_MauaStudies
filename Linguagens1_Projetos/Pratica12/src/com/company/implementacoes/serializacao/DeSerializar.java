package com.company.implementacoes.serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class DeSerializar {
    public static void main(String[] args) {
        Pessoa p1, p2;

        try {
            // Access file
            FileInputStream fileInputStream = new FileInputStream("ecm251.txt");

            // Access file data
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Read file data
            p1 = (Pessoa) objectInputStream.readObject();
            p2 = (Pessoa) objectInputStream.readObject();

            System.out.println("Pessoas.: " + p1 + p2);

            objectInputStream.close();
            fileInputStream.close();


        } catch (Exception exception){
            System.out.println("Something's wrong I can feel it");
            exception.printStackTrace();
        }

    }
}
