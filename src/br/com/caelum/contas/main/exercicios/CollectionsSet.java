package br.com.caelum.contas.main.exercicios;

import java.util.HashSet;
import java.util.Set;

public class CollectionsSet {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("java");
        conjunto.add("php");
        conjunto.add("javascript");

//        for (String palavra : conjunto) {
//            System.out.println(palavra);
//        }

        System.out.println(conjunto);
    }
}
