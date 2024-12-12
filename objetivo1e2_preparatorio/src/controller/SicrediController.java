package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SicrediController {
    public static void main(String[] args) {

        //c
        //Crie 3 instâncias de cada classe (das possíveis de criar instâncias), insira valores válidos
        //nos atributos dessas instâncias, e imprima esses objetos;
        System.out.println("\n***** c *****");
        ContaCorrente cc1 = new ContaCorrente(300.00, 0);
        ContaCorrente cc2 = new ContaCorrente(430.00, 0);
        ContaCorrente cc3 = new ContaCorrente(300.00, 0);

        ContaPoupanca cp1 = new ContaPoupanca(0.00);
        ContaPoupanca cp2 = new ContaPoupanca(0.00);
        ContaPoupanca cp3 = new ContaPoupanca(0.00);

        Cliente c1 = new Cliente(0, "C1");
        Cliente c2 = new Cliente(0, "C2");
        Cliente c3 = new Cliente(0, "C3");

        //d
        System.out.println("\n***** d *****");
        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        List<Associado> associados = new ArrayList<>();
        associados.add(cc1);
        associados.add(cc2);
        associados.add(cc3);
        associados.add(c1);
        associados.add(c2);
        associados.add(c3);
        System.out.println(contas);
        System.out.println(associados);

        //e
        System.out.println("\n***** e *****");
        cp1.deposita(1000.00);
        cp1.atualiza(5.0);
        cp1.saca(1000.00);
        System.out.println(cp1);

        //f
        System.out.println("\n***** f *****");
        cc1.deposita(1000.00);
        cc1.atualiza(10.0);
        cc1.saca(1000.00);
        System.out.println(cc1);

        //g
        System.out.println("\n***** g *****");
        cc1.setQdeCotas(100);
        cc2.setQdeCotas(400);
        cc3.setQdeCotas(600);
        c1.setQdeCotas(300);
        c2.setQdeCotas(600);
        c3.setQdeCotas(600);
        System.out.println(associados);

        //h
        System.out.println("\n***** h *****");
        associados.sort(Comparator.comparing(Associado::getQuantidadeDeCotas).reversed());
        System.out.println(associados);
        Associado associadoComMaxCotas =
                 associados.stream() //1. Cria um fluxo pra coleção
                .max(Comparator.comparing(Associado::getQuantidadeDeCotas)) //2. ache o max baseado na quantidade de cotas
                .get(); //3. colete esse objeto
        for (Associado associado : associados) {
            if(associado.getQuantidadeDeCotas() == associadoComMaxCotas.getQuantidadeDeCotas()) {
                System.out.println(associado);
            }
        }

        //i
        System.out.println("\n***** i *****");
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println(contas);
        for (Conta conta : contas) {
            if(conta instanceof Associado) {
                System.out.println(conta);
            }
        }
        Conta contaComMaxSaldo =
                contas.stream() //1. Cria um fluxo pra coleção
                        .max(Comparator.comparing(Conta::getSaldo)) //2. ache o max baseado na quantidade de cotas
                        .get(); //3. colete esse objeto
        System.out.println(contaComMaxSaldo);
        for (Conta conta : contas) {
            if(conta.getSaldo() == contaComMaxSaldo.getSaldo()) {
                System.out.println(conta);
            }
        }
    }
}
