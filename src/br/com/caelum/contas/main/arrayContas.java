package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;

public class arrayContas {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente conta1 = new ContaCorrente();
        conta1.deposita(1000);

        contas[0] = conta1;

        contas[1] = new ContaCorrente();
        contas[1].deposita(2000);

        System.out.println("Primeira conta: " + contas[0].getSaldo());
        System.out.println("Segunda conta: " + contas[1].getSaldo());
    }

}
