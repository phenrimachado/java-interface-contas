package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
    public String getTipo() {
        return "Conta Corrente";
    }

    @Override
    public void saca(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Você tentou sacar um valor negativo");
        }
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException(valor);
        }
        this.saldo -= (valor + 0.10);
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }

    public int compareTo(ContaCorrente outra) {
        if (this.saldo < outra.saldo) {
            return -1;
        }

        if (this.saldo > outra.saldo) {
            return 1;
        }

        return 0;
    }
}
