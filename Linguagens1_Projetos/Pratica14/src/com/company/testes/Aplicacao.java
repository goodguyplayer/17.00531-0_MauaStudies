package com.company.testes;

import com.company.models.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Aplicacao {
    public void run(){
        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:sqlite:dados.db");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM produtos");

            while (result.next()){
                Produto produto = new Produto(
                        result.getString("codigo"),
                        result.getString("nome"),
                        result.getString("descricao"),
                        result.getDouble("custo"),
                        result.getDouble("valor"),
                        result.getInt("quantidade")
                );
                System.out.println(produto);
            }

            result.close();

        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
