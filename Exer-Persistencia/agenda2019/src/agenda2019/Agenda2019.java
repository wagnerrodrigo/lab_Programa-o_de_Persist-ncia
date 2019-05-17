/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda2019;

import DAO.ContatoDAO;
import java.util.List;
import modelo.Contato;
import org.hibernate.Session;

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
        Contato contato2 = new Contato();
        
//        contato.setNome("wagner");
//        contato.setTelefone("988031096");
        
        // segundo contato
        
        contato.setNome("Filipe");
        contato.setTelefone("988140342");
        // terceiro contato
        
        contato2.setNome("Rafaela");
        contato2.setTelefone("988033423");
        
        contatodao.persist(contato);
        contatodao.persist(contato2);
        System.out.println("Finalizar projeto");
        
//        Session = contatodao.getCurrentSession();
//        List<Contato> lista = (List<Contato>)
    }
    
}
