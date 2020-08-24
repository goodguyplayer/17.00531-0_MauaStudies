package com.company.dao;

import com.company.models.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements DAO<Produto> {
    private Connection connection;
    private String myDBConnectionString = "jdbc:sqlite:dados.db";

    public ProdutoDAO (){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


    @Override
    public List<Produto> getAll() {
        List<Produto> produtos = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM produtos");
            while(result.next()){
                Produto produto = new Produto(
                        result.getString("codigo"),
                        result.getString("nome"),
                        result.getString("descricao"),
                        result.getDouble("custo"),
                        result.getDouble("valor"),
                        result.getInt("quantidade")
                );
                produtos.add(produto);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return produtos;
    }

    @Override
    public void update(Produto produto) {

    }

    @Override
    public void delete(Produto produto) {

    }

    @Override
    public void create(Produto produto) {

    }
}
