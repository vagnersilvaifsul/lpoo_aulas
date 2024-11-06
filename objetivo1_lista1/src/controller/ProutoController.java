package controller;

import model.Produto;

import java.util.*;

public class ProutoController {
    public static void main(String[] args) {
        //C.i.
        Produto p1 = new Produto();
        p1.setId(1);
        Produto p2 = new Produto();
        p2.setId(2);
        p2.setNome("Açúcar");

        //C.ii.
        Produto p3 = new Produto(3,"Arroz", "Arroz Ceolin 5kg tipo1 longo", 21.90, 1000);
        Produto p4 = new Produto(4, "Feijão", "Feijão Tordilho 1kg tipo1 longo", 6.90, 5000);

        //C.iii.
        Produto p5 = new Produto("Café", 21.90);
        p5.setId(5);
        Produto p6 = new Produto("Café", 21.90);
        p6.setId(6);

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
        produtosList.add(p6);
        produtosList.add(p6);
        produtosList.add(p6);

        //2a. Operação de impressão da coleção
        System.out.println("******** List ******");
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


        /* Coleções do tipo Map */
        //List<Produto> produtosList = new ArrayList<>();
        Map<Integer, Produto> produtosMap = new HashMap<>();
        //1a. Operacão adição de objetos na List
        produtosMap.put(p1.getId(), p1);
        produtosMap.put(p2.getId(), p2);
        produtosMap.put(p3.getId(), p3);
        produtosMap.put(p4.getId(), p4);
        produtosMap.put(p5.getId(), p5);
        produtosMap.put(p6.getId(), p6);
        produtosMap.put(p6.getId(), p6);
        produtosMap.put(p6.getId(), p6);
        produtosMap.put(p6.getId(), p6);
        System.out.println("******** Map ******");
        System.out.println(produtosMap);

        //Pesquisa em Map
        System.out.println("Objeto de id=5");
        System.out.println(produtosMap.get(p5.getId()));

        //Ordenação é proibida num Map
        //produtosMap.sort
    }
}
