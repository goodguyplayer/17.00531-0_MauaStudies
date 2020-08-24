package com.company.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Aplicacao {
    public void run(){
        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:sqlite:dados.db");
            Statement statement = connection.createStatement();
            statement.executeQuery("SELECT * FROM produtos");
            
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
