/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Cliente;
import javax.persistence.EntityManager;

/**
 *
 * @author alunoces
 */
public class ClienteDao {
    public void salvarAtualizar(Cliente cliente){
        EntityManager em = Conexao.getEntityManager();
                      em.getTransaction().begin();
       if(cliente.getId() != null){
           cliente = em.merge(cliente);
       }
       em.persist(cliente);
       em.getTransaction().commit();
       em.close();
    }
    
    
     public void excluir(Cliente cliente){
        EntityManager em = Conexao.getEntityManager();
                      em.getTransaction().begin();
                      cliente = em.merge(cliente);
                      em.remove(cliente);
                      em.getTransaction().commit();
                      em.close();
     
     }
}
