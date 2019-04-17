/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexão.ConectionFactory;
import Dominio.Alunos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class AlunosDao {
    private Connection conecta;
    
    public AlunosDao(){
        this.conecta = new ConectionFactory().conecta();
    }
    
    public void cadastrarAluno(Alunos obj){
    
        try {
            String cmdsql ="insert into alunos(alu_nome, alu_email, alu_celular, alu_cpf, alu_obs) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getEmail());
            stmt.setInt(3, obj.getCelular());
            stmt.setInt(4, obj.getCpf());
            stmt.setString(5, obj.getObs());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public void excluirAluno(Alunos obj){
        try {
            String cmdsql = "delete from alunos where alu_matricula=?";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setInt(1, obj.getMatricula());
            stmt.execute();
            
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public void alterarAluno(Alunos obj){
        try {
            String cmdsql = "update alunos set alu_nome=?, alu_email=?, alu_celular=?, alu_cpf=?, alu_obs=?, where alu_matricula";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getEmail());
            stmt.setInt(3, obj.getCelular());
            stmt.setInt(4, obj.getCpf());
            stmt.setString(5, obj.getObs());
            
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public List<Alunos> listarAlunos(){
        try {
            List<Alunos> lista = new ArrayList<Alunos>();
            String Sql="Select * from alunos";
            PreparedStatement stmt = conecta.prepareStatement(Sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Alunos a = new Alunos();
                a.setMatricula(rs.getInt("alu_matricula"));
                a.setNome(rs.getString("alu_nome"));
                a.setEmail(rs.getString("alu_email"));
                a.setCelular(rs.getInt("alu_celular"));
                a.setCpf(rs.getInt("alu_cpf"));
                a.setObs(rs.getString("alu_obs"));
                lista.add(a);
                
            }return lista;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
