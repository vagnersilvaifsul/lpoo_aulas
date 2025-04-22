package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class EmpresaController {
    public static void main(String[] args) {
        //a está no pacote model

        //b na organização do projeto


        //c
        Funcionario d1 = new Desenvolvedor();
        Funcionario d2 = new Desenvolvedor("Ana", 1000.0);
        Funcionario g1 = new Gerente();
        Funcionario g2 = new Gerente("Rafael", 2000.0);

        //d
        System.out.println("Dados iniciais");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(g1);
        System.out.println(g2);

        //e
        System.out.println("\nAlterando dados");
        d1.setNome("Joao");
        d1.setSalario(1000.0);
        System.out.println(d1);
        g1.setNome("Maria");
        g1.setSalario(2000.0);
        System.out.println(g1);

        //f
        System.out.println("\nCálculo do bônus");
        System.out.println(d1.getBonus());
        System.out.println(d2.getBonus());
        System.out.println(g1.getBonus());
        System.out.println(g2.getBonus());

        //g
        //i) Não. Por que ela está marcada como uma clase abstrata.
        //ii) No método sobreescrito getBonus() das classes Gerente e Funcionario.

        //2a
        List<Funcionario> funcionarioList = new ArrayList<>();

        //2b

        System.out.println("Lista de funcionários inicial:");
        System.out.println(funcionarioList);
        //2b. Acrescente na coleção criada no item “a” vinte funcionários, sendo, 2 gerentes e 18 desenvolvedores.
        //cria os gerentes
        //2i
        Funcionario ger1 = new GerenteGeral("Ana Júlia", 6500.00);
        //2ii
        Funcionario ger2 = new GerenteDesenvolvimento("Rafael", 4500.00);

        //cria mais 18 Desenvolvedores
        //2iii
        Funcionario dev1 = new DesenvolvedorSenior("Beatriz", 3500.00);
        Funcionario dev2 = new DesenvolvedorSenior("Ana", 3500.00);
        Funcionario dev3 = new DesenvolvedorSenior("Elis", 3500.00);
        Funcionario dev4 = new DesenvolvedorSenior("João", 3500.00);
        Funcionario dev5 = new DesenvolvedorSenior("Mario", 3500.00);
        Funcionario dev6 = new DesenvolvedorSenior("José", 3500.00);
        //2iii
        Funcionario dev7 = new DesenvolvedorPleno("Júlia", 2500.00);
        Funcionario dev8 = new DesenvolvedorPleno("Paula", 2500.00);
        Funcionario dev9 = new DesenvolvedorPleno("Rafaela", 2500.00);
        Funcionario dev10 = new DesenvolvedorPleno("Denise", 2500.00);
        Funcionario dev11 = new DesenvolvedorPleno("Carlos", 2500.00);
        Funcionario dev12 = new DesenvolvedorPleno("Tomaz", 2500.00);
        //2iii
        Funcionario dev13 = new DesenvolvedorJunior("Cíntia", 1800.00);
        Funcionario dev14 = new DesenvolvedorJunior("Glória", 1800.00);
        Funcionario dev15 = new DesenvolvedorJunior("Caio", 1800.00);
        Funcionario dev16 = new DesenvolvedorJunior("Roberto", 1800.00);
        Funcionario dev17 = new DesenvolvedorJunior("Clara", 1800.00);
        Funcionario dev18 = new DesenvolvedorJunior("Mel", 1800.00);

        funcionarioList.add(ger1);
        funcionarioList.add(ger2);
        funcionarioList.add(dev1);
        funcionarioList.add(dev2);
        funcionarioList.add(dev3);
        funcionarioList.add(dev4);
        funcionarioList.add(dev5);
        funcionarioList.add(dev6);
        funcionarioList.add(dev7);
        funcionarioList.add(dev8);
        funcionarioList.add(dev9);
        funcionarioList.add(dev10);
        funcionarioList.add(dev11);
        funcionarioList.add(dev12);
        funcionarioList.add(dev13);
        funcionarioList.add(dev14);
        funcionarioList.add(dev15);
        funcionarioList.add(dev16);
        funcionarioList.add(dev17);
        funcionarioList.add(dev18);
        System.out.println("\nFuncinários adicionados na empresa:");
        System.out.println(funcionarioList);

        //c Calcule e imprima qual é a folha salarial dessa empresa, COM bônus;
        double acumTotalFolhaComBonus = 0.0;
        for(Funcionario f : funcionarioList) {
            acumTotalFolhaComBonus +=  f.getSalario() + f.getBonus();
        }
        System.out.println("\nCalcule e imprima qual é a folha salarial dessa empresa, COM bônus= " + acumTotalFolhaComBonus);


        //d Calcule e imprima qual é a folha salarial dessa empresa, SEM bônus;
        double acumTotalFolhaSEMBonus = 0.0;
        for(Funcionario f : funcionarioList) {
            acumTotalFolhaSEMBonus +=  f.getSalario();
        }
        System.out.println("\nCalcule e imprima qual é a folha salarial dessa empresa, SEM bônus= " + NumberFormat.getCurrencyInstance().format(acumTotalFolhaSEMBonus) );

        //e Calcule e imprima o valor do bônus e o salário bruto de cada um dos funcionários dessa empresa;
        System.out.println("\n");
        for(Funcionario f : funcionarioList) {
            System.out.println(f.getClass().getSimpleName() + " " + f.getNome());
            System.out.println("Salario Bruto= " + f.getSalario() + f.getBonus());
            System.out.println("Bônus= " + f.getBonus());
        }


        //f Calcule e imprima a nova folha salarial dessa empresa, caso todos os funcionários, independente de cargo, tenham um reajuste salarial de 5%.
        double acumTotalNovaFolhaComBonus = 0.0;
        for(Funcionario f : funcionarioList) {
            f.setSalario(f.getSalario() * 1.05);
            acumTotalNovaFolhaComBonus +=  f.getSalario() + f.getBonus();
        }
        System.out.println("Calcule e imprima a nova folha salarial dessa empresa, caso todos os funcionários,\n" +
                "independente de cargo, tenham um reajuste salarial de 5%= " + acumTotalNovaFolhaComBonus);

    }
}
