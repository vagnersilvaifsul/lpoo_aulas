package controller;

import model.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProutoController {
    public static void main(String[] args) {
        //C.i.
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        p2.setNome("Açúcar");

        //C.ii.
        Produto p3 = new Produto("Arroz", "Arroz Ceolin 5kg tipo1 longo", 21.90, 1000);
        Produto p4 = new Produto("Feijão", "Feijão Tordilho 1kg tipo1 longo", 6.90, 5000);

        //C.iii.
        Produto p5 = new Produto("Café", 21.90);
        Produto p6 = new Produto("Café", 21.90);

        //C.iv
        System.out.println("Olá " + "mundo.");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

        //C.v.
        p1.setNome("Leite");
        p1.setDescricao("Leite longa vida LG 1l");
        p1.setEstoque(3000);
        p1.setValor(5.70);
        System.out.println(p1.getNome() + " " + p1.getDescricao() + " " + p1.getEstoque() + " " + p1.getValor());

        //Manipulando Coleções

        //Tipo List ou Array ou Vetor
        List<Produto> produtosList = new ArrayList<>();
        //1a. Operacão adição de objetos na List
        produtosList.add(p1);
        produtosList.add(p2);
        produtosList.add(p3);
        produtosList.add(p4);
        produtosList.add(p5);
        produtosList.add(p6);

        //2a. Operação de impressão da coleção
        System.out.println(produtosList);

        //3a. Operação de ordenação
        //crescente
        produtosList.sort(Comparator.comparing(Produto::getNome));
        System.out.println(produtosList);

        //decrescente
        produtosList.sort(Comparator.comparing(Produto::getNome).reversed());
        System.out.println(produtosList);

        //4a. Pesquisa
        //técnica da força bruta, utilizando fori
        for (int i = 0; i < produtosList.size(); i++) {
            if(produtosList.get(i).getNome().equals("Leite")){
                System.out.println(produtosList.get(i));
            }
        }
        //Eu aconselho vocês a utilizar esse for, o for each no estilo Java 7
        for (Produto p : produtosList) {
            if(p.getNome().equals("Leite")){
                System.out.println(p);
            }
        }

        //forEach do Java 8+
        produtosList.forEach(p -> {
            if(p.getNome().equals("Leite")){
                System.out.println(p);
            }
        });

        //técnica de pesquisa binária
        //1o. Ordene o array de forma crescente
        produtosList.sort(Comparator.comparing(Produto::getNome));
        //2o. Aplique o método de pesquisa binária
        int indiceProduto = Collections.binarySearch(
                produtosList, //coleção a ser percorrida na pesquisa
                new Produto("Leite", 5.7), //chave da pesquisq
                Comparator.comparing(Produto::getNome) //critério da pesquisa
        );
        System.out.println("\nSaída da pesquisa binária");
        System.out.print(produtosList.get(indiceProduto));

    }
}
