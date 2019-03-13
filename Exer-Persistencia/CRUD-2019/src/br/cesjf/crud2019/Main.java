/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.crud2019;

import JDPC.ConectionFactory;
import java.sql.Connection;

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
    }
}
