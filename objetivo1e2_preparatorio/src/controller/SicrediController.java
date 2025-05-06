package controller;

import model.*;

import java.util.*;

public class SicrediController {
    public static void main(String[] args) {
        //1c.
        ContaPoupanca cp1 = new ContaPoupanca(1000.0);
        ContaPoupanca cp2 = new ContaPoupanca(2000.0);
        ContaPoupanca cp3 = new ContaPoupanca(3000.0);
        ContaCorrente cc1 = new ContaCorrente(1000.0, 100);
        ContaCorrente cc2 = new ContaCorrente(2000.0, 400);
        ContaCorrente cc3 = new ContaCorrente(3000.0, 600);
        Cliente c1 = new Cliente(300, "Ana");
        Cliente c2 = new Cliente(600, "Rafa");
        Cliente c3 = new Cliente(600, "Adao");

        //1d. Crie as coleções necessárias para expressar as contas registradas no sistema
        List<Conta> contaList = new ArrayList<>();
        contaList.add(cp1);
        contaList.add(cp2);
        contaList.add(cp3);
        contaList.add(cc1);
        contaList.add(cc2);
        contaList.add(cc3);

        List<Associado> associadoList = new ArrayList<>();
        associadoList.add(cc1);
        associadoList.add(cc2);
        associadoList.add(cc3);
        associadoList.add(c1);
        associadoList.add(c2);
        associadoList.add(c3);

        System.out.println("Contas criadas:");
        System.out.println(contaList);
        System.out.println("\nAssociados criados:");
        System.out.println(associadoList);

        //1e.
        System.out.println("Movimente, pelo menos, uma conta poupança, realizando as seguintes operações: depósito\n" +
                "de R$ 1.000,00; atualização monetária de 5%; saque de R$ 1000,00. Imprima o objeto;");
        cp1.deposita(1000.0);
        cp1.atualiza(5.0);
        cp1.saca(1000.0);
        System.out.println(cp1);

        //1f.
        System.out.println("Movimente, pelo menos, uma conta corrente, realizando as seguintes operações: depósito\n" +
                "R$ 1.000,00; atualização monetária de 10%; saque de R$ 1000,00. Imprima o objeto;");
        cc1.deposita(1000.0);
        cc1.atualiza(10.0);
        cc1.saca(1000.0);
        System.out.println(cc1);

        //1g. feita nos construtores
        System.out.println("Faça com que cada associado tenha as seguintes quantidades de cotas, nessa ordem: 100,\n" +
                "400, 600, 300, 600, 600, e imprima a coleção de associados");
        System.out.println(associadoList);

        //1h.
        System.out.println("A partir das coleções, imprima todos os associados, ordenados pelo critério de número de\n" +
                "cotas, em ordem decrescente");
        associadoList.sort(Comparator.comparing(Associado::getQdeCotas).reversed());
        System.out.println(associadoList);
        System.out.println("E faça o programa calcular e imprimir os associados com o\n" +
                "maior número de cotas no sistema;");
        double maxQdeCotas = 0.0;
        for(Associado a : associadoList){
            if(maxQdeCotas < a.getQdeCotas()){
                maxQdeCotas = a.getQdeCotas();
            }
        }
        double maxQdeCotasCollections =
                Collections.max(
                        associadoList,
                        Comparator.comparing(Associado::getQdeCotas)).getQdeCotas();
        double maxQdeCotasLambda =
                associadoList.stream()
                        .max(Comparator.comparing(Associado::getQdeCotas))
                        .get().getQdeCotas();
        for (Associado a : associadoList) {
            if(a.getQdeCotas() == maxQdeCotas){
                System.out.println(a);
            }
        }

        //1i
        System.out.println("A partir das coleções, imprima todas as contas cadastradas no sistema, ordenadas pelo\n" +
                "critério saldo, em ordem decrescente");
        contaList.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println();
        System.out.println("E, imprima todos associados que seja do tipo\n" +
                "Associado e possua conta cadastrada no sistema, em qualquer ordem.");
        for(Associado a : associadoList){
            if(a instanceof Conta){
                System.out.println(a);
            }
        }
        System.out.println("Também faça o\n" +
                "programa imprimir a lista de contas com maior saldo bancário.");
        double maxSaldoConta =
                Collections.max(
                        contaList,
                        Comparator.comparing(Conta::getSaldo)).getSaldo();
        for (Conta c : contaList) {
            if(c.getSaldo() == maxSaldoConta){
                System.out.println(c);
            }
        }




    }
}
