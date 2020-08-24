package com.company.testes;

import java.sql.Connection;
import java.sql.DriverManager;

public class Aplicacao {
    public void run(){
        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:sqlite:dados.db");
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
