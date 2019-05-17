/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda2019;

import DAO.ContatoDAO;
import modelo.Contato;

/**
 *
 * @author alunoces
 */
public class Agenda2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciando o Projeto");
        
        ContatoDAO contatodao = new ContatoDAO();
        
        Contato contato = new Contato();
        contato.setNome("wagner");
        contato.setTelefone("988031096");
        
        contatodao.persist(contato);
        System.out.println("Finalizar projeto");
    }
    
}
