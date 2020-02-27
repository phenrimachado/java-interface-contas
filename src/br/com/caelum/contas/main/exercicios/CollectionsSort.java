package br.com.caelum.contas.main.exercicios;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {
    public static void main(String[] args) {
//        List<String> lista = new ArrayList<>();
//        lista.add("Pedro");
//        lista.add("Henrique");
//        lista.add("Sérgio");
//
//        System.out.println(lista);
//
//        Collections.sort(lista);
//
//        System.out.println(lista);

        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(500);

        ContaCorrente c2 = new ContaCorrente();
        c2.deposita(1000);

        ContaCorrente c3 = new ContaCorrente();
        c3.deposita(200);

        List<ContaCorrente> contas = new ArrayList<>();

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        Collections.sort(contas);

        System.out.println(contas);
    }
}
