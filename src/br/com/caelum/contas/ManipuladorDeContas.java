package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

import java.io.IOException;
import java.util.Collections;
import java.util.List;


public class ManipuladorDeContas {

    private Conta conta;

    public void criaConta(Evento evento) {
        String tipo = evento.getSelecionadoNoRadio("tipo");
        if(tipo.equals("Conta Corrente")) {
            this.conta = new ContaCorrente();
        } else if (tipo.equals("Conta Poupança")) {
            this.conta = new ContaPoupanca();
        }
        this.conta.setAgencia(evento.getString("agencia"));
        this.conta.setNumero(evento.getInt("numero"));
        this.conta.setTitular(evento.getString("titular"));
    }

    public void deposita(Evento evento) {
        double valor = evento.getDouble("valorOperacao");
        this.conta.deposita(valor);
    }

    public void saca(Evento evento) {
        double valor = evento.getDouble("valorOperacao");
        this.conta.saca(valor);
    }

    public void transfere(Evento evento) {
        Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
        this.conta.transfere(evento.getDouble("valorTransferencia"), destino);
    }

    public void ordenaLista(Evento evento) {
        List<Conta> contas = evento.getLista("destino");
        Collections.sort(contas);
    }

    public void salvaDados(Evento evento) {
        List<Conta> contas = evento.getLista("listaContas");
        RepositorioDeContas repositorio = new RepositorioDeContas();
        repositorio.salva(contas);
    }

    public List<Conta> carregaDados() throws Exception {
        RepositorioDeContas repositorio = new RepositorioDeContas();
        return repositorio.carrega();
    }
}
