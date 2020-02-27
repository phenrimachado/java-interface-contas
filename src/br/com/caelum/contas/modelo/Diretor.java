package br.com.caelum.contas.modelo;

public class Diretor extends Funcionario implements Autenticavel{

    private int senha;

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso negado!");
            return false;
        }
    }
}
