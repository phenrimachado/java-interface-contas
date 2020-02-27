package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta> {

    private String titular;
    private String agencia;
    private int numero;
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void deposita(double valor) {
        if(valor < 0) {
            throw new IllegalArgumentException("Você tentou depositar um valor negativo");
        } else {
            this.saldo += valor;
        }
    }

    public void saca(double valor) {
        if(valor < 0) {
            throw new IllegalArgumentException("Você tentou sacar um valor negativo");
        } else if(this.saldo < valor){
            throw new SaldoInsuficienteException(valor);
        } else {
            this.saldo -= valor;
        }
    }

    public abstract String getTipo();

    public void transfere(double valor, Conta conta) {
        this.saca(valor);
        conta.deposita(valor);
    }

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: R$ " + this.saldo;
        dados += "\nTipo: " + this.getTipo();
        return dados;
    }

    public String toString() {
        String titular = this.titular;
        return titular = titular.toUpperCase();
    }

    public int compareTo(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
    }
}
