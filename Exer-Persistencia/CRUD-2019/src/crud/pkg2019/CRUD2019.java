/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.pkg2019;

import JDPC.ConectionFactory;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author alunoces
 */
public class CRUD2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            JOptionPane.showMessageDialog(null, "testando a conexão");
            Connection con = new ConectionFactory().conecta();
            JOptionPane.showMessageDialog(null, "Conexaoo realizada com sucesso.");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro:" +e);
        }
    }
    
}
