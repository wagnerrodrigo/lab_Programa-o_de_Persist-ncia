/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Dominio.Cliente;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author alunoces
 */
public class ClienteControl {

    //private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    
    public void salva(){
        clientedao.salvarAtualizar(clienteDigitado);
        novo();
        pesquisar();
    }
    
    public void excluir(){
        clientedao.excluir(clienteDigitado);
        novo();
        pesquisar();
    }
    
    public final void novo(){
        setClienteDigitado(new Cliente());
    }
    
    public final void pesquisar(){
        clientesTabelas.clear();
        clientesTabelas.addAll(clientedao.pesquisar(clienteDigitado));
    }
    
    
}
