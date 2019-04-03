/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDPC;

import DAO.AlunoDAO;
import br.cesjf.crud2019.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author alunoces
 */
public class AlunoJDBC extends ConectionFactory implements AlunoDAO{
    
    
    @Override
    public void inserir(Aluno aluno) throws DAOException {
        Connection conn=null;
        PreparedStatement stmt=null;
    try {
    // Inserção
        } catch (SQLException e) {
            throw new DAOException("Erro ao inserir!", e);
        } finally {
            if( stmt != null ){
        try{
            stmt.close();
          }catch( SQLException e ){ e.printStackTrace(); }
        }
        if( conn != null ){
        try{
            conn.close();
        } catch( SQLException e ){ e.printStackTrace(); }
       }
      }
    }
}
