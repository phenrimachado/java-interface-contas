package br.com.caelum.javaio;

import br.com.caelum.contas.ManipuladorDeContas;

import java.io.IOException;

public class TestaMetodoCarrega {

    public static void main(String[] args) throws Exception {

        ManipuladorDeContas manipulador = new ManipuladorDeContas();

        manipulador.carregaDados();
    }
}
