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
import java.sql.SQLException;

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
            String cmdsql ="insert into alunos(alu_nome, alu_emal, alu_celular, alu_cpf,alu_obs) valures(?,?,?,?,?)";
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
}
