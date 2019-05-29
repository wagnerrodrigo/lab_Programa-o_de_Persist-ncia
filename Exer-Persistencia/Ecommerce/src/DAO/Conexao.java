/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alunoces
 */
public class Conexao {
    public static EntityManagerFactory emf;
    private static Conexao conexao;
    
    
    private Conexao(){
        emf = Persistence.createEntityManagerFactory("EcommercePU");
    }
    
    public synchronized static EntityManager getEntityManager(){
        if(conexao == null){
            conexao = new Conexao();
        }
          return emf.createEntityManager();
    }
    
}
