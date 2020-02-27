package br.com.caelum.contas.main.exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TrintaMilNumeros {

    public static void main(String[] args) {
        System.out.println("Iniciando...");
        Collection<Integer> teste = new HashSet<>();
        long inicioPrimeiroFor = System.currentTimeMillis();

        int total = 300000;

        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        long finalPrimeiroFor = System.currentTimeMillis();

        finalPrimeiroFor = finalPrimeiroFor - inicioPrimeiroFor;
        System.out.println("Tempo gasto no primeiro for: " + finalPrimeiroFor);

        long inicioSegundoFor = System.currentTimeMillis();

        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        long finalSegundoFor = System.currentTimeMillis();
        finalSegundoFor = finalSegundoFor - inicioSegundoFor;
        System.out.println("Tempo gasto segundo for: " + finalSegundoFor);
    }
}
