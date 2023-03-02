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
        System.out.println("List");
        System.out.println(clientes);
        //ordenação
        Collections.reverse(clientes);
        System.out.println(clientes);
        Collections.shuffle(clientes);
        System.out.println("shuffle");
        System.out.println(clientes);
        //pesquisa
        System.out.println("contains");
        System.out.println(clientes.contains(new Cliente(1L, "Rafael", "Silva")));
        clientes.forEach(c -> {
            if(c.getId() == 1L){
                System.out.println("Localizou o cliente: " + c);
            }
        });

        //criar e popular a Map
        Map<Long, Cliente> clientesM = new HashMap();
        clientesM.put(c1.getId(), c1);
        clientesM.put(c2.getId(), c2);
        System.out.println("Map");
        System.out.println(clientesM);
        //pesquisa
        System.out.println("Map Pesquisa");
        System.out.println(clientesM.get(c2.getId()));


    }
}
