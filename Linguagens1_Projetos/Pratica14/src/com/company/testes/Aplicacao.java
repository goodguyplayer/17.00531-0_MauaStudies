package com.company.testes;

import com.company.models.Produto;

import java.sql.*;

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

            //Inserir um novo produto
            Produto produto = new Produto("2000", "Water cooler 120mm", "Cooler", 80, 240, 5);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO produtos (codigo, nome, descricao, custo, valor, quantidade) VALUES (?, ?, ?, ?, ?, ?);" );
            preparedStatement.setString(1, produto.getCodigo());
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(1, produto.getDescricao());
            preparedStatement.setDouble(1, produto.getCusto());
            preparedStatement.setDouble(1, produto.getValor());
            preparedStatement.setInt(1, produto.getQuantidade());

            // Execute prepared statement
            int retorno = preparedStatement.executeUpdate();
            System.out.println("Retorno: " + retorno);

            // Save modifications
            connection.commit();


        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
