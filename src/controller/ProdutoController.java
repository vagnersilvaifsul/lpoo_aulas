package controller;

import model.Produto;

import java.util.Arrays;

public class ProdutoController {

    public static void main(String[] args) {

//        Arrays.asList(args).forEach(System.out::println);
//        System.out.println(args.length);
//        System.out.println();

        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Maria", 100, 5.00);

        System.out.println(produto1);
        produto1.setNome("Adão");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Estoque: " + produto1.getEstoque());
        System.out.println("Preço: " + produto1.getPreco());

        System.out.println();
        System.out.println(produto2);
    }
}