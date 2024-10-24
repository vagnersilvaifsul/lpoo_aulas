package controller;

import model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", 8, 45.0f); //tipoDaVariável nomeDaVariável = valorDaVariável; - Gente! Isso não mudou. A diferença é que do lado direito não tenho um valor, mas uma chamada para um método (um procedimento)

        Pessoa pessoa2 = new Pessoa(); //a partir do tipo class, nesse caos controller.Pessoa, é possível criar n objetos na memória RAM, cada um com o seu próprio valor nos atributos
        Pessoa pessoa3 = new Pessoa();

        System.out.println(pessoa1); //para imprimir um objeto o compilador necessita de um conversor de controller.Pessoa para String. Note que eu o adicionei lá na classe, ele é um método e chama-se toString()
        System.out.println(pessoa2);
        System.out.println(pessoa3);

    }
}