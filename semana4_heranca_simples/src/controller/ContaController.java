package controller;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.ContaSalario;

public class ContaController {
    public static void main(String[] args) {
        /*
            Comentamos esse código quando resolvemos marcar a classe Conta com abstract.
         */
//        Conta conta = new Conta();
//        System.out.println("Criou o objeto conta");
//        System.out.println(conta);
//        conta.deposita(1000.00);
//        System.out.println("Depositou 1000.00");
//        System.out.println(conta);

        /*
            Poderíamos criar o objeto da linha 26 assim: ContaCorrente cc1 = new ContaCorrente();
            Bom, vai funcionar, mas, para tiramos proveito do Polimorfismo (assunto que veremos logo a seguir)
            recomenda-se criar como está na linha 26: Conta cc1 = new ContaCorrente(); com a classe mãe
            como tipo da variável.
         */
        Conta cc1 = new ContaCorrente();
        System.out.println("\n\nCriou o objeto ContaCorrente");
        System.out.println(cc1);
        System.out.println("Depositou 2000.00");
        cc1.deposita(2000.00);
        System.out.println(cc1);
        cc1.saca(3000.00);
        System.out.println("Saldo depois do saque de 4000.00");
        System.out.println(cc1);

        Conta cp1 = new ContaPoupanca();
        System.out.println("\n\nCriou o objeto ContaPoupanca");
        System.out.println(cp1);
        System.out.println("Depositou 3000.00");
        cp1.deposita(3000.00);
        System.out.println(cp1);

        Conta cs1 = new ContaSalario();
        System.out.println("\n\nCriou o objeto ContaSalario");
        System.out.println(cs1);
        System.out.println("Depositou 4000.00");
        cs1.deposita(4000.00);
        System.out.println(cs1);
    }
}
