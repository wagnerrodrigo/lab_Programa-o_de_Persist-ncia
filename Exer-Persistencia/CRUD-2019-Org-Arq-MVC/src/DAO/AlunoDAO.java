/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDPC.ConectionFactory;
import br.cesjf.crud2019.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author alunoces
 */
public interface AlunoDAO {
  
  
    
    void insere(Aluno aluno);
    
    List<Aluno> listar();
    
    void exluir(Aluno aluno);
    
    void atualiza(Aluno aluno);
}
