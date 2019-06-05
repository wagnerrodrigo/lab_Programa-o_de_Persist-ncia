/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author alunoces
 */
@Entity
@Table (name="TB_Cliente") //renomear a tabela do banco
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id   // chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)  // geração automadica auto incremente
    private Long id;
    @Column(name="MN_Cliente",length = 255, nullable = false)  /// nome da coluna tamnho do campo nao recebe valor em branco
    private String nome;
    @Column(name="MN_Email",length=255, nullable = false)
    private String email;

    public Cliente() { // o framework presica de construtor vazio
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Cliente[ id=" + id + " ]";
    }
    
}
