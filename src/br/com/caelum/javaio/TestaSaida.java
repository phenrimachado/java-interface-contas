package br.com.caelum.javaio;

import java.io.*;

public class TestaSaida {

    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("/home/basis/Documentos/testeSaida.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Caelum");
        bw.close();
    }
}
