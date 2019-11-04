/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Pessoa {
    //ATRIBUTOS
    private String nome;
    private String sobrenome;
    private String CPF;
    
    //CONSTRUTORES
    //VAZIO
    public Pessoa() {
    }
    //CHEIO
    public Pessoa(String nome, String sobrenome, String CPF) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
    }
    
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    //MÉTODOS
    public void validarCPF(String cpf){
        if(cpf.length() == 11)
        {
            System.out.println("CPF Válido!");
        }
        else
        {
            System.out.println("CPF Inválido.");
        }
    }
    
    public void getNomeCompleto(){
        System.out.println(this.nome + " " + this.sobrenome);
    }
}
