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
public class Conta {
    //ATRIBUTOS
    private int numero;
    private double saldo;
    private double limite;
    
    //CONSTRUTORES
    //VAZIO
    public Conta() {
    }
    //CHEIO
    public Conta(int numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }
    
    //GETTERS E SETTERS
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    //MÉTODOS
    public void sacar(double valor){
        if(this.saldo >= valor)
        {
            this.saldo -= valor;
            System.out.println("\nValor sacado: " + valor + "\n" + "Saldo após saque: " + this.saldo);
        }
        else
        {
            System.out.println("Saldo Insuficiente.\n");
        }
    }
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("\nValor depositado: " + valor + "\n" + "Saldo após depósito: " + this.saldo);
    }
    public void transferir(double valor, Conta objConta){
        if(this.saldo >= valor)
        {
            sacar(valor);
            objConta.depositar(valor);
        }
        else
        {
            System.out.println("Transferencia não autorizada.\n");
        }
    }
}
