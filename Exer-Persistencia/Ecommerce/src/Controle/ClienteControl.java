/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.ClienteDao;
import Dominio.Cliente;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class ClienteControl {

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private Cliente clienteDigitado;
    private Cliente clienteSelecionado;
    private List<Cliente> clientesTabelas;
    private ClienteDao clientedao;
    
    public Cliente getClienteDigitado(){
        return clienteDigitado;
    }
    
    public void setClienteDigitado(Cliente clienteDigitado){
        Cliente oldClienteDigitado = this.clienteDigitado;
        this.clienteDigitado = clienteDigitado;
        propertyChangeSupport.firePropertyChange("clienteDigitado",oldClienteDigitado,clienteDigitado);        
    }
    
    public Cliente getClienteSelecionado(){
        return clienteSelecionado;
    }
    
    public void setClienteSelecionado(Cliente clienteSelecionado){
        if (this.clienteSelecionado !=null) {
            setClienteDigitado(clienteSelecionado);            
        }
        this.clienteSelecionado = clienteSelecionado;
    }
    
    public List<Cliente> getClientesTabelas(){
        return clientesTabelas;
    }
    
    public void setClientesTabelas(List<Cliente> clientesTabelas){
        this.clientesTabelas = clientesTabelas;
    }
    
    public ClienteControl(){
        clientedao = new ClienteDao();
        clientesTabelas = ObservableCollections.observableList(new ArrayList<Cliente>());
        novo();
        pesquisar();
    }
    
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
    
    public void addPropertyChangeListener(PropertyChangeListener e){
        propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e){
        propertyChangeSupport.removePropertyChangeListener(e);
    }
    
}
