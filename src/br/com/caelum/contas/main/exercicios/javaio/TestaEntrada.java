package br.com.caelum.contas.main.exercicios.javaio;

import java.io.*;

public class TestaEntrada {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        int c = isr.read();
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println(s);
    }
}
