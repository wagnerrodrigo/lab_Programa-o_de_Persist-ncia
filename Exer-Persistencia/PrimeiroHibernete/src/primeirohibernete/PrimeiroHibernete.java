/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeirohibernete;

import Util.HibernateUtil;
import classes.Departamento;
import classes.Funcionario;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author alunoces
 */
public class PrimeiroHibernete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  Departamento d1 = new Departamento();
        Departamento d2 = new Departamento();
        d1.setNome("Informatica");
        d2.setNome("vendas");
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Wagner Rodrigo");
        f1.setCpf(123678912);
        f1.setDepartamento(d1);
        
        Funcionario f2 = new Funcionario();
        f2.setNome("Paulo");
        f2.setCpf(1234561231);
        f2.setDepartamento(d2);
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(d1);
        s.save(d2);
        s.save(f1);
        s.save(f2);
        s.getTransaction().commit();
        */
      
       Funcionario f1 = new Funcionario();
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       s.beginTransaction();
       List<Funcionario> lista = (List<Funcionario>)s.createQuery("From Funcionario").list();
       for(Funcionario f: lista){
           System.out.println("Nome: " + f.getNome());
           System.out.println("Departamento: " + f.getDepartamento().getNome());
       }
       s.getTransaction().commit();
    }
   
}
