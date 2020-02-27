package br.com.caelum.contas.modelo;


public class Teste {

    public static void main(String[] args) {

        System.out.println("x");
        System.out.println(3);
        System.out.println(false);

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.deposita(200);
        cp.deposita(200);

        System.out.println(cc.toString());
    }

    static void println() {}

    static void println(int a) {}

    static void println(boolean valor) {}

    static void println(Object referencia) {}
}
