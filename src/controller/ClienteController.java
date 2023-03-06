package controller;

import model.Cliente;

import java.util.*;

public class ClienteController {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1L, "Ana", "Silva");
        System.out.println(c1.getNome());
        System.out.println(c1.getSobrenome());
        System.out.println(c1);

        //Array (ArrayList)

        //criar e popular a List
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        Cliente c2 = new Cliente(2L, "Rafael", "Silva");
        clientes.add(c2);
        System.out.println("\nList");
        System.out.println(clientes);

        //ordenação
        Collections.reverse(clientes);
        System.out.println("\nOrdena com Collections.reverse");
        System.out.println(clientes);
        Collections.shuffle(clientes);
        System.out.println("\nOrdena com Collections.shuffle (embaralha a collection)");
        System.out.println(clientes);

        //pesquisa
        System.out.print("\nPesquisa com contains= ");
        System.out.println(clientes.contains(new Cliente(1L, "Rafael", "Silva")));
        //pesquisa por força bruta
        /*
            O ideal seria utilizar a pesquisa binária, porém, ao utilizar Collections, padrão Java7,
            a classe de modelo deveria implementar Comparable, assundo a ser tratado em Herança.
            A dica aqui é utilizar stream (programação funcional), que já é mais recente, do Java8 em diante.
         */
        clientes.forEach(c -> {
            if(c.getId() == 1L){
                System.out.println("\nPesquisa por força bruta: " + c);
            }
        });
        //pesquisa binária
        /*
            Para ela funcionar a classe de modelo deveria implementar Comparable. Assunto de herança.
         */
        //Collections.binarySearch(clientes, 1L);

        //criar e popular a Map
        Map<Long, Cliente> clientesM = new HashMap();
        clientesM.put(c1.getId(), c1);
        clientesM.put(c2.getId(), c2);
        System.out.println("\nMap");
        System.out.println(clientesM);
        //pesquisa
        System.out.println("\nMap Pesquisa");
        System.out.println(clientesM.get(c2.getId()));


    }
}
