package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class EmpresaController {
    public static void main(String[] args) {

        //c
        Desenvolvedor d1 = new Desenvolvedor();
        Desenvolvedor d2 = new Desenvolvedor("Ana", 1000.00);
        Gerente g1 = new Gerente();
        Gerente g2 = new Gerente("Rafael", 2000.00);

        //d
        System.out.println("Objetos criados");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(g1);
        System.out.println(g2);

        //e
        d1.setNome("Maria");
        d1.setSalario(1000.00);
        g1.setNome("João");
        g1.setSalario(2000.00);
        System.out.println("Objetos modificados com os setters");
        System.out.println(d1);
        System.out.println(g1);

        //f
        System.out.println(d1.getBonus());
        System.out.println(d2.getBonus());
        System.out.println(g1.getBonus());
        System.out.println(g2.getBonus());

        //g
        //Funcionario f1 = new Funcionario();
        //Porque a classe Funcionario está marcada como abstrata
        //Nas classes concretas, Gerente e Desenvolvedor. Facilita a manutenção do código.

        //2a
        List<Funcionario> funcionarios = new ArrayList<>();

        GerenteGeral gg1 = new GerenteGeral();
        gg1.setNome("gg1");
        gg1.setSalario(6500.00);
        GerenteDesenvolvimento gd1 = new GerenteDesenvolvimento();
        gd1.setNome("gd1");
        gd1.setSalario(4500.00);


        DesenvolvedorSenior ds1 = new DesenvolvedorSenior();
        ds1.setNome("ds1");
        ds1.setSalario(3500.00);
        DesenvolvedorSenior ds2 = new DesenvolvedorSenior();
        ds2.setNome("ds2");
        ds2.setSalario(3500.00);
        DesenvolvedorSenior ds3 = new DesenvolvedorSenior();
        ds3.setNome("ds3");
        ds3.setSalario(3500.00);
        DesenvolvedorSenior ds4 = new DesenvolvedorSenior();
        ds4.setNome("ds4");
        ds4.setSalario(3500.00);
        DesenvolvedorSenior ds5 = new DesenvolvedorSenior();
        ds5.setNome("ds5");
        ds5.setSalario(3500.00);
        DesenvolvedorSenior ds6 = new DesenvolvedorSenior();
        ds6.setNome("ds6");
        ds6.setSalario(3500.00);

        DesenvolvedorPleno dp1 = new DesenvolvedorPleno();
        dp1.setNome("ds1");
        dp1.setSalario(3500.00);
        DesenvolvedorPleno dp2 = new DesenvolvedorPleno();
        dp2.setNome("ds2");
        dp2.setSalario(3500.00);
        DesenvolvedorPleno dp3 = new DesenvolvedorPleno();
        dp3.setNome("ds3");
        dp3.setSalario(3500.00);
        DesenvolvedorPleno dp4 = new DesenvolvedorPleno();
        dp4.setNome("ds4");
        dp4.setSalario(3500.00);
        DesenvolvedorPleno dp5 = new DesenvolvedorPleno();
        dp5.setNome("dp5");
        dp5.setSalario(3500.00);
        DesenvolvedorPleno dp6 = new DesenvolvedorPleno();
        dp6.setNome("dp6");
        dp6.setSalario(3500.00);

        DesenvolvedorJunior dj1 = new DesenvolvedorJunior();
        dj1.setNome("dj1");
        dj1.setSalario(1800.00);
        DesenvolvedorJunior dj2 = new DesenvolvedorJunior();
        dj2.setNome("dj2");
        dj2.setSalario(1800.00);
        DesenvolvedorJunior dj3 = new DesenvolvedorJunior();
        dj3.setNome("dj3");
        dj3.setSalario(1800.00);
        DesenvolvedorJunior dj4 = new DesenvolvedorJunior();
        dj4.setNome("dj4");
        dj4.setSalario(1800.00);
        DesenvolvedorJunior dj5 = new DesenvolvedorJunior();
        dj5.setNome("dj1");
        dj5.setSalario(1800.00);
        DesenvolvedorJunior dj6 = new DesenvolvedorJunior();
        dj6.setNome("dj6");
        dj6.setSalario(1800.00);

        //2c
        funcionarios.add(gg1);
        funcionarios.add(gd1);
        funcionarios.add(ds1);
        funcionarios.add(ds2);
        funcionarios.add(ds3);
        funcionarios.add(ds4);
        funcionarios.add(ds5);
        funcionarios.add(ds6);
        funcionarios.add(dp1);
        funcionarios.add(dp2);
        funcionarios.add(dp3);
        funcionarios.add(dp4);
        funcionarios.add(dp5);
        funcionarios.add(dp6);
        funcionarios.add(dj1);
        funcionarios.add(dj2);
        funcionarios.add(dj3);
        funcionarios.add(dj4);
        funcionarios.add(dj5);
        funcionarios.add(dj6);
        double acumFolhaComBonus = 0.0;
        for (Funcionario funcionario : funcionarios) {
            acumFolhaComBonus += funcionario.getSalario() + funcionario.getBonus();
        }
        System.out.println("Folha com bônus");
        System.out.println(acumFolhaComBonus);

        //2d
        double acumFolhaSemBonus = 0.0;
        for (Funcionario funcionario : funcionarios) {
            acumFolhaSemBonus += funcionario.getSalario();
        }
        System.out.println("Folha sem bônus");
        System.out.println(acumFolhaSemBonus);

        //2e
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.getSalario());
            System.out.println(funcionario.getBonus());
            System.out.println(funcionario.getSalario() + funcionario.getBonus());
        }

        double acumFolhaAposDissidio = 0.0;
        for (Funcionario funcionario : funcionarios) {
            funcionario.setSalario(funcionario.getSalario() * 0.05);
            acumFolhaAposDissidio += funcionario.getSalario() + funcionario.getBonus();
        }
        System.out.println("Folha após dissidio");
        System.out.println(acumFolhaAposDissidio);

    }
}
