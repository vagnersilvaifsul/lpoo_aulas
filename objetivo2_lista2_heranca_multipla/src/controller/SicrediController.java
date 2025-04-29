package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SicrediController {
    public static void main(String[] args) {
        //1a) Interprete o diagrama de classes abaixo na tecnologia Java;
        // Está na interpretação do diagrama de classes, no pacote model

        //1b) Organize o projeto em camadas MVC;
        //Está na organização do projeto em pacotes que representam as camadas do Software

        //1c. Crie seis instâncias de cada classe do diagrama (das possíveis) com valores válidos para os seus atributos. Imprima estes objetos e verifique o resultado;
        Desenvolvedor dev1 = new Desenvolvedor("Elis", 2500.00);
        Desenvolvedor dev2 = new Desenvolvedor("João", 2500.00);
        Desenvolvedor dev3 = new Desenvolvedor("Mario", 2500.00);
        Desenvolvedor dev4 = new Desenvolvedor("José", 2500.00);
        Desenvolvedor dev5 = new Desenvolvedor("Júlia", 2500.00);
        Desenvolvedor dev6 = new Desenvolvedor("Paula", 2500.00);
        System.out.println("*********** Questão 1c ***********");
        System.out.print("\nDesenvolvedores criados: ");
        System.out.print(dev1 + "" +  dev2 + dev3 + dev4 + dev5 + dev6);

        //1c. Crie seis instâncias de cada classe do diagrama (das possíveis) com valores válidos para os seus atributos. Imprima estes objetos e verifique o resultado;
        Gerente ger1 = new Gerente("Ana", 4500.00, "ALUP11", 500);
        Gerente ger2 = new Gerente("Rafal", 4500.00, "ALUP11", 1000);
        Gerente ger3 = new Gerente("Aline", 4500.00, "ALUP11", 1000);
        Gerente ger4 = new Gerente("Talita", 4500.00, "ALUP11", 1000);
        Gerente ger5 = new Gerente("Paulo", 6500.00, "ALUP11", 1000);
        Gerente ger6 = new Gerente("Cris", 6500.00, "ALUP11", 2000);
        System.out.print("\n\nGerentes criados: ");
        System.out.print(ger1 + "" +  ger2 + ger3 + ger4 + ger5 + ger6);

        //1c. Crie seis instâncias de cada classe do diagrama (das possíveis) com valores válidos para os seus atributos. Imprima estes objetos e verifique o resultado;
        Cliente cli1 = new Cliente("João", "Dias", "ALUP11", 500);
        Cliente cli2 = new Cliente("Tânia", "Pereira", "ALUP11", 1000);
        Cliente cli3 = new Cliente("Mel", "Soares", "ALUP11", 1000);
        Cliente cli4 = new Cliente("Luna", "Farias", "ALUP11", 1000);
        Cliente cli5 = new Cliente("Maria", "Terra", "ALUP11", 1000);
        Cliente cli6 = new Cliente("Pedro", "Santos", "ALUP11", 2000);

        //1c. Crie seis instâncias de cada classe do diagrama (das possíveis) com valores válidos para os seus atributos. Imprima estes objetos e verifique o resultado;
        System.out.print("\n\nClientes criados: ");
        System.out.print(cli1 + "" +  cli2 + cli3 + cli4 + cli5 + cli6);

        // d) Crie as coleções necessárias para representar os tipos de dados que podem ser manipulados neste sistema;
        List<Funcionario> funcionarioList = new ArrayList<>();
        List<Investidor> investidorList = new ArrayList<>();
        System.out.println("\nLista criadas:");
        System.out.println(funcionarioList);
        System.out.println(investidorList);

        //e) Insira os objetos criados no item c nas coleções criadas no item d. Imprima estas coleções;
        funcionarioList.add(dev1);
        funcionarioList.add(dev2);
        funcionarioList.add(dev3);
        funcionarioList.add(dev4);
        funcionarioList.add(dev5);
        funcionarioList.add(dev6);
        funcionarioList.add(ger1);
        funcionarioList.add(ger2);
        funcionarioList.add(ger3);
        funcionarioList.add(ger4);
        funcionarioList.add(ger5);
        funcionarioList.add(ger6);
        investidorList.add(cli1);
        investidorList.add(cli2);
        investidorList.add(cli3);
        investidorList.add(cli4);
        investidorList.add(cli5);
        investidorList.add(cli6);
        investidorList.add(ger1);
        investidorList.add(ger2);
        investidorList.add(ger3);
        investidorList.add(ger4);
        investidorList.add(ger5);
        investidorList.add(ger6);
        System.out.println("\nLista populadas:");
        System.out.println("Lista de Funcionários: ");
        System.out.println(funcionarioList);
        System.out.println("Lista de Investidores   : ");
        System.out.println(investidorList);

        //f) A partir das coleções criadas no item d liste todos os funcionários cadastrados, ordenandoos pelo salário, em ordem decrescente;
        System.out.println("\nLista de Funcionários ordenados, critério salário, ordem decrescente: ");
        funcionarioList
                .sort(Comparator.comparing(Funcionario::getSalario)
                .reversed());
        System.out.println(funcionarioList);

        //g) A partir das coleções criadas no item d liste todos os clientes cadastrados, ordenando-os
        //pela quantidade de cotas, em ordem decrescente;
        System.out.println("\nLista de clientes ordenados, critério quantidade de cotas, ordem decrescente: ");
        investidorList
                .sort(Comparator.comparing(Investidor::getQdeCotas)
                .reversed());
        for (Investidor i : investidorList) {
            if(i instanceof Cliente){
                System.out.println(i);
            }
        }

        //h) A partir das coleções criadas no item d liste todos os investidores cadastrados,
        // ordenandos pela quantidade de cotas, em ordem decrescente;
        investidorList
                .sort(Comparator.comparing(Investidor::getQdeCotas)
                        .reversed());
        System.out.println("\nLista de investidores ordenados, critério quantidade de cotas, ordem decrescente: ");
        System.out.println(investidorList);

        //i) A partir das coleções criadas no item d faça a aplicação
        // imprimir os funcionários com o maior salário;
        Funcionario maiorSalario =
                funcionarioList
                        .stream() //1. Cria um fluxo para a coleção
                        .max(Comparator.comparing(Funcionario::getSalario)) //2. Localiza o valor máximo
                        .get(); //3. Coleta o resultado
        //Prefiram essa estratégia
        Funcionario maiorSalarioCollections =
                Collections
                        .max(funcionarioList, Comparator.comparing(Funcionario::getSalario));
        System.out.println("\n\n");

        System.out.println("Lista de funcionários com maior salário na empresa:");
        for (Funcionario f : funcionarioList) {
            if(f.getSalario() == maiorSalarioCollections.getSalario()){
                System.out.println(f);
            }
        }

        //j) A partir das coleções criadas no item d faça a aplicação imprimir os investidores com o
        //maior número de cotas
        //Prefiram essa estratégia
        Investidor maiorSQdeCotasCollections =
                Collections
                        .max(investidorList, Comparator.comparing(Investidor::getQdeCotas));
        System.out.println("\n\n");

        System.out.println("Lista de investidores com maior número de cotas:");
        for (Investidor i : investidorList) {
            if(i.getQdeCotas() == maiorSQdeCotasCollections.getQdeCotas()){
                System.out.println(i);
            }
        }
    }
}
