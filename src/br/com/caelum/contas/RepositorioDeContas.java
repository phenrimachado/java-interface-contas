package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositorioDeContas {

    public void salva(List<Conta> contas) {

        PrintStream stream = null;
        try {
            stream = new PrintStream("contas.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(Conta conta : contas) {
            stream.println(conta.getTipo() + "," + conta.getNumero() + ","
                + conta.getAgencia() + "," + conta.getTitular() + ","
                + conta.getSaldo());
        }
        stream.close();
    }

    public List<Conta> carrega() throws Exception {

        InputStream is = new FileInputStream("contas.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        List<Conta> contas = new ArrayList<>();
        while (s != null) {
            Scanner scanner = new Scanner(s);
            String linha = scanner.nextLine();
            String[] valores = linha.split(",");
            String tipo = valores[0].trim();
            String numeroTexto = valores[1].trim();
            int numero = Integer.parseInt(numeroTexto);
            String agencia = valores[2].trim();
            String titular = valores[3].trim();
            String saldoTexto = valores[4];
            double saldo = Double.parseDouble(saldoTexto);

            Conta novaConta = null;

            if (tipo.equals("Conta Corrente")) {
                novaConta = new ContaCorrente();
                novaConta.setNumero(numero);
                novaConta.setAgencia(agencia);
                novaConta.setTitular(titular);
                novaConta.deposita(saldo);
            }
            if (tipo.equals("Conta Poupança")) {
                novaConta = new ContaPoupanca();
                novaConta.setNumero(numero);
                novaConta.setAgencia(agencia);
                novaConta.setTitular(titular);
                novaConta.deposita(saldo);
            }

            contas.add((Conta) novaConta);

            s = br.readLine();
        }
        br.close();

        return contas;
    }
}
