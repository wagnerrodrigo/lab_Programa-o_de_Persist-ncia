/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author alunoces
 */
public class Alunos {
    public int matricula;
    public String nome;
    public String email;
    public int celular;
    public int cpf;
    public String obs;

    //construtor

    public Alunos(int matricula, String nome, String email, int celular, int cpf, String obs) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.cpf = cpf;
        this.obs = obs;
    }

    
    //construtor  
    public Alunos() {
    }

    
    
    // get e set
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    //toString

    @Override
    public String toString() {
        return "Alunos{" +
               "matricula=" + matricula + 
               ", nome=" + nome + 
               ", email=" + email + 
               ", celular=" + celular + 
               ", cpf=" + cpf + 
               ", obs=" + obs + '}';
    }
    
}
