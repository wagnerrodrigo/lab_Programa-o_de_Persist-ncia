/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.crud2019;

import java.util.Date;

/**
 *
 * @author alunoces
 */
public class Aluno {
    private int id;
    private String nome;
    private Date dataMatricula;
    private String enderco;
    private String telefone;
    private Date dataNacimento;
    private Float altura;
    private Float peso;


// construtor
    public Aluno(int id, String nome, Date dataMatricula, String enderco, String telefone, Date dataNacimento, Float altura, Float peso) {
        this.id = id;
        this.nome = nome;
        this.dataMatricula = dataMatricula;
        this.enderco = enderco;
        this.telefone = telefone;
        this.dataNacimento = dataNacimento;
        this.altura = altura;
        this.peso = peso;
    }

    public Aluno() {
    }
    
    
// metodos get set   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getEnderco() {
        return enderco;
    }

    public void setEnderco(String enderco) {
        this.enderco = enderco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(Date dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
 
// metodo tostring
    @Override
    public String toString() {
        return "\n Aluno{" + "id=" + id + ","
                + " nome=" + nome
                + ", dataMatricula=" + dataMatricula 
                + ", enderco=" + enderco 
                + ", telefone=" + telefone + ", "
                + "dataNacimento=" + dataNacimento + ","
                + " altura=" + altura + ", peso=" + peso + '}';
    }
}



