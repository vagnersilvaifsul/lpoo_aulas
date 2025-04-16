package controller;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.ContaSalarioPoupanca;

public class SistemaBancarioController {
    public static void main(String[] args) {
        //Conta conta = new Conta(); //Não é possível criar objetos de classes abstratas
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp2 = new ContaPoupanca(2000.0);
        ContaCorrente cc2 = new ContaCorrente(2000.0);
        ContaSalarioPoupanca csp1 = new ContaSalarioPoupanca();
        System.out.println("Contas inicializadas no sistema");
        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(csp1);

        System.out.println("\n\n");
        cp1.deposita(1000.0);
        System.out.println(cp1);
        cp1.saca(1000.0);
        System.out.println(cp1);

    }
}
