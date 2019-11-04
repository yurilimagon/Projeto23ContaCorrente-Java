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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Pessoa objPessoa01 = new Pessoa("Pessoa1", "Silva", "11111111111");
        Pessoa objPessoa02 = new Pessoa("Pessoa2", "Souza", "22222222222");
        objPessoa01.validarCPF(objPessoa01.getCPF());
        objPessoa01.getNomeCompleto();
        objPessoa02.validarCPF(objPessoa02.getCPF());
        objPessoa02.getNomeCompleto();
        
        Endereco objEnd01 = new Endereco("Rua 1", "1", "Cidade1", "Estado1", "111111-111");
        Endereco objEnd02 = new Endereco("Rua 2", "2", "Cidade2", "Estado2", "222222-222");
        objEnd01.getLocalizacaoByCEP("111111-111");
        objEnd02.getLocalizacaoByCEP("222222-222");
        
        Conta objConta01 = new Conta(111111, 1000, 2000);
        Conta objConta02 = new Conta(222222, 1000, 2000);
        objConta01.sacar(100);
        objConta02.sacar(100);
        objConta01.depositar(200);
        objConta02.depositar(200);
        objConta01.transferir(100, objConta02);
        objConta02.transferir(100, objConta01);
    }
    
}
