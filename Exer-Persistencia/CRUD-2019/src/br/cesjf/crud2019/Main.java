/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.crud2019;

import JDPC.ConectionFactory;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class Main {
    public static void main(String[] args) {
//     insere(new Aluno(0, "wagner rodrigo",new Date(),"rua x", "988031094", new Date(), 1.93f, 100f));
//     insere(new Aluno(0, "paulo ferreira",new Date(),"rua x", "988051403", new Date(), 1.93f, 78f));
        List<Aluno> alunos = listar();
        
        System.out.println(alunos);
    }
    
    
    public static void insere(Aluno aluno){
        // conexao com o banco
        Connection comn = new ConectionFactory().conecta(); 
        // cria a query
        String sql = "INSERT INTO aluno (alu_nome, alu_dataMatricula, alu_endereco, alu_telefone, alu_dataNacimento, alu_altura, alu_peso)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";
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
            throw new RuntimeException("Erro ao inserir aluno!"+e);
        }
    }
    
    public static List<Aluno> listar(){
        List<Aluno> alunos = new ArrayList<>();
        Connection comn = new ConectionFactory().conecta();
        String sql = "SELECT * FROM aluno";
        try {
            Statement stat = comn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                Aluno aluno = new Aluno();
                aluno.setId((int) rs.getLong("alu_id"));
                aluno.setNome(rs.getString("alu_nome"));
                aluno.setDataMatricula(rs.getDate("alu_datamatricula"));
                aluno.setEnderco(rs.getString("alu_endereco"));
                aluno.setTelefone(rs.getString("alu_telefone"));
                aluno.setDataNacimento(rs.getDate("alu_dataNacimento"));
                aluno.setAltura(rs.getFloat("alu_altura"));
                aluno.setPeso(rs.getFloat("alu_peso"));
                alunos.add(aluno);                
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar aluno");
            e.printStackTrace();
            throw new RuntimeException();
        }
        return alunos;
    }
    
    
}
