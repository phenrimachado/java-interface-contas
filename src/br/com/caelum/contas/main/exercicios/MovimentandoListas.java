package br.com.caelum.contas.main.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovimentandoListas {
    public static void main(String[] args) {
        List numeros = new ArrayList();
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println(numeros);
//
//        Collections.shuffle(numeros);
//
//        System.out.println(numeros);
//
//        Collections.shuffle(numeros);
//
//        System.out.println(numeros);

        Collections.rotate(numeros, 1);

        System.out.println(numeros);
    }
}
