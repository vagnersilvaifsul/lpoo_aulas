package controller;

import model.Funcionario;

public class FuncionarioController {
    public static void main(String[] args) {
        //a está na estrutura do projeto

        //b está no pacote model

        //c
        //i
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        //ii
        Funcionario f3 = new Funcionario("Ana", 3000.0);
        Funcionario f4 = new Funcionario("Rafael", 4000.0);
        //iii
        Funcionario f5 = new Funcionario("Mario");
        Funcionario f6 = new Funcionario("Maria");

        //iv
        System.out.println(f1.toString());
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);

        //v
        f1.setNome("Fulano de 1");
        f1.setSalario(1000.0);
        f2.setNome("Fulano de 2");
        f2.setSalario(2000.0);
        f3.setNome("Fulano de 3");
        f3.setSalario(3000.0);
        f4.setNome("Fulano de 4");
        f4.setSalario(4000.0);
        f5.setNome("Fulano de 5");
        f5.setSalario(5000.0);
        f6.setNome("Fulano de 6");
        f6.setSalario(6000.0);

        //vi
        System.out.println(f1.getNome());
        System.out.println(f1.getSalario());
        System.out.println(f2.getNome());
        System.out.println(f2.getSalario());
        System.out.println(f3.getNome());
        System.out.println(f3.getSalario());
        System.out.println(f4.getNome());
        System.out.println(f4.getSalario());
        System.out.println(f5.getNome());
        System.out.println(f5.getSalario());
        System.out.println(f6.getNome());
        System.out.println(f6.getSalario());



    }
}
