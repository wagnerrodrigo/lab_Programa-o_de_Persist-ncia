/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProdutoDao;
import java.beans.PropertyChangeSupport;
import Dominio.Produto;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author alunoces
 */
public class ProdutoControl {
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private Produto produtoDigitado;
    private Produto produtoSelecionado;
    private List<Produto> produtosTabelas;
    private ProdutoDao produtodao;
    
    public Produto getProdutoDigitado(){
        return produtoDigitado;
    }
    
    public void setProdutoDigitado(Produto produtoDigitado){
        Produto oldProdutoDigitado = this.produtoDigitado;
        this.produtoDigitado = produtoDigitado;
        propertyChangeSupport.firePropertyChange("ProdutoDigitado",oldProdutoDigitado,produtoDigitado);
    }
    
    public Produto getProdutoSelecionado(){
        return produtoSelecionado;
    }
    
    public void setProdutoSelecionado(Produto produtoSelecionado){
        if(this.produtoSelecionado !=null){
            setProdutoDigitado(produtoSelecionado);
        }
         this.produtoSelecionado = produtoSelecionado;
    }   
    
    public List<Produto> getProdutosTabelas(){
        return produtosTabelas;
    }
    
    public void setProdutosTabelas(List<Produto> produtosTabelas ){
        this.produtosTabelas = produtosTabelas;
    }
    
    public ProdutoControl(){
        produtodao = new ProdutoDao();
        produtosTabelas = ObservableCollections.observableList(new ArrayList<Produto>());
        novoProduto();
        pesquisarProduto();
    }
    public void salvaProduto(){
        produtodao.salvarAtualizar(produtoDigitado);
        novoProduto();
        pesquisarProduto();
    }
    public void excluirProduto(){
        produtodao.excluir(produtoDigitado);
        novoProduto();
        pesquisarProduto();
    }
    
    public final void novoProduto(){
        setProdutoDigitado(new Produto());
    }
    
    public final void pesquisarProduto(){
        produtosTabelas.clear();
        produtosTabelas.add(produtodao.pesquisar(produtoDigitado));
        
    }
    
}
