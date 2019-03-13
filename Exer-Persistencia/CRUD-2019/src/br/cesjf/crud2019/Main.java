/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.crud2019;

import JDPC.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author alunoces
 */
public class Main {
    public static void insere(Aluno aluno){
        // conexao com o banco
        Connection comn = new ConectionFactory().conecta(); 
        // cria a query
        String sql = "INSERT INTO aluno (nome, dataMatricula, enderco, telefone, dataNacimento, altura, peso),"
                + "VALURES(?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = comn.prepareStatement(sql);
            
            statement.setString(1, aluno.getNome());
            statement.setDate(2, new java.sql.Date(aluno.getDataMatricula().getTime()));
            statement.setString(3, aluno.getEnderco());
            statement.setString(4, aluno.getTelefone());
            statement.setDate(5, new java.sql.Date(aluno.getDataNacimento().getTime()));
            statement.setFloat(6, aluno.getAltura());
            statement.setFloat(7, aluno.getPeso());
            
            int linhasAfetadas = statement.executeUpdate();
            if (linhasAfetadas>0){
                System.out.println("Inserção realizada com sucesso");
            }else{
                throw new RuntimeException("Erro ao inserir aluno");
            }
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir aluno!");
        }
    }
}
