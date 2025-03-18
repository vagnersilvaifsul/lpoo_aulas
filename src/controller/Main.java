package controller;

import model.Carro;
import model.Moto;
import model.Pessoa;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Joao";
        pessoa.idade = 18;
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Rafael";
        pessoa1.idade = 24;
        Pessoa pessoa2 = new Pessoa();
//        pessoa2.nome = "Maria";
//        pessoa2.idade = 45;
        System.out.println("controller.Pessoa=" + pessoa);
        System.out.println("Pessoa1=" + pessoa1);
        System.out.println("Pessoa2=" + pessoa2);
        System.out.println("a= " + a);

        Carro carro = new Carro();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        System.out.println("controller.Carro=" + carro);
        System.out.println("controller.Carro=" + carro1);
        System.out.println("controller.Carro=" + carro2);

        Moto moto = new Moto();
        Moto moto1 = new Moto();
        Moto moto2 = new Moto();
        System.out.println("Moto=" + moto);
        System.out.println("Moto1=" + moto1);
        System.out.println("Moto2=" + moto2);
    }
}
