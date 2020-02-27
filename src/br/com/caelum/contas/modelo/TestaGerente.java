package br.com.caelum.contas.modelo;

public class TestaGerente {
    public static void main(String[] args) {
        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Gerente func1 = new Gerente();
        func1.setSalario(5000);
        controle.registra(func1);

        Funcionario func2 = new Funcionario();
        func2.setSalario(1000);
        controle.registra(func2);

        System.out.println(controle.getTotalDeBonificacoes());
    }
}
