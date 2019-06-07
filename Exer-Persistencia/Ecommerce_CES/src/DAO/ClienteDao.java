/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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
     
     public List<Cliente> pesquisar(Cliente cliente){
         EntityManager em = Conexao.getEntityManager();
         StringBuilder sql = new StringBuilder("from Cliente c where 1=1");
         
         if (cliente.getId()!=null) {
             sql.append("and c.id like :id ");
         }
         if (cliente.getNome()!=null && !cliente.getNome().equals("")) {
             sql.append("and c.nome like :nome ");             
         }
         if (cliente.getEmail()!=null && !cliente.getEmail().equals("")) {
             sql.append("and c.email like :email ");             
         }
         Query query = em.createQuery(sql.toString());
         
         if (cliente.getId() !=null) {
             query.setParameter("id", cliente.getId());
         }
         if (cliente.getNome() !=null && !cliente.getNome().equals("")) {
             query.setParameter("nome","%" + cliente.getNome());             
         }
         if (cliente.getEmail() !=null && !cliente.getEmail().equals("")) {
             query.setParameter("email","%" + cliente.getEmail());
         }
         return query.getResultList();
     }
}
