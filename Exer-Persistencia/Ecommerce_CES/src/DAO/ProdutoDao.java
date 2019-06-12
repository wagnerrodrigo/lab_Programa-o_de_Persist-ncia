/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @autHor alunoces
 */
public class ProdutoDao {
     public void salvarAtualizar(Produto produto){
        EntityManager em = Conexao.getEntityManager();
                      em.getTransaction().begin();
       if(produto.getId() != null){
           produto = em.merge(produto);
       }
       em.persist(produto);
       em.getTransaction().commit();
       em.close();
    }
    
    
     public void excluir(Produto produto){
        EntityManager em = Conexao.getEntityManager();
                      em.getTransaction().begin();
                      produto = em.merge(produto);
                      em.remove(produto);
                      em.getTransaction().commit();
                      em.close();
     
     }
     
     public List<Produto> pesquisar(Produto produto){
         EntityManager em = Conexao.getEntityManager();
         StringBuilder sql = new StringBuilder("from Produto c where 1=1");
         
         if (produto.getId()!=null) {
             sql.append("and c.id like :id ");
         }
         if (produto.getNome()!=null && !produto.getNome().equals("")) {
             sql.append("and c.nome like :nome ");             
         }
         if (produto.getEmail()!=null && !produto.getEmail().equals("")) {
             sql.append("and c.email like :email ");             
         }
         Query query = em.createQuery(sql.toString());
         
         if (produto.getId() !=null) {
             query.setParameter("id", produto.getId());
         }
         if (produto.getNome() !=null && !produto.getNome().equals("")) {
             query.setParameter("nome","%" + produto.getNome());             
         }
         if (produto.getEmail() !=null && !produto.getEmail().equals("")) {
             query.setParameter("email","%" + produto.getEmail());
         }
         return query.getResultList();
     }
}
