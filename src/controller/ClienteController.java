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
        System.out.println("\n******************** Criação ********************");
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        Cliente c2 = new Cliente(2L, "Rafael", "Silva");
        clientes.add(c2);
        Cliente c3 = new Cliente(3L, "Francisca", "Santos");
        clientes.add(c3);
        System.out.println("\nList");
        System.out.println(clientes);

        //ordenação
        System.out.println("\n******************** Ordenação ********************");
        Collections.reverse(clientes);
        System.out.println("\nOrdena com Collections.reverse");
        System.out.println(clientes);
        Collections.shuffle(clientes);
        System.out.println("\nOrdena com Collections.shuffle (embaralha a collection)");
        System.out.println(clientes);
        Collections.sort(clientes, Comparator.comparing(Cliente::getNome));
        System.out.println("\nOrdena com Collections.sort");
        System.out.println(clientes);
        //ou utiliza como prefixo da chamada a própria coleção
        System.out.println("\nou");
        clientes.sort(Comparator.comparing(Cliente::getNome).reversed()); //cria uma stream e usa o predicado como critério
        System.out.println(clientes);

        //pesquisa
        System.out.println("\n******************** Pesquisa ********************");
        System.out.print("\nPesquisa com contains= "); //é preciso implementar equals e hashcode
        System.out.println(clientes.contains(new Cliente(1L, "Rafael", "Silva")));
        //pesquisa por força bruta (evite seu uso)
        /*
            O ideal é utilizar a pesquisa binária, pois, o algoritmo é otimizado para pesquisa.
         */
        clientes.forEach(c -> {
            if(c.getId() == 1L){
                System.out.println("\nPesquisa por força bruta: " + c);
            }
        });
        //pesquisa binária (Dê preferencia para esse tipo de pesquisa ao invés da pesquisa por força bruta)
        System.out.print("\nCollections.binarySearch");
        System.out.println(
            clientes.get(
                Collections.binarySearch(
                    clientes,
                    new Cliente(3L, "Francisca", "Santos"),
                    Comparator.comparing(Cliente::getNome)
                )
            )
        );
        System.out.print("\nUtilizando Stream, com clientes.stream()");
        System.out.print("\nLocalizando um cliente pela chave de pesquisa (nome=Francisca) na coleção do tipo List: ");
        Cliente clienteFind =
            clientes.stream()
                .filter(c -> c.getNome().equals("Francisca"))
                .findAny().orElse(null);
        System.out.println(clienteFind);

        //criar e popular a Map
        Map<Long, Cliente> clientesM = new HashMap<>();
        clientesM.put(c1.getId(), c1);
        clientesM.put(c2.getId(), c2);
        System.out.println("\nMap");
        System.out.println(clientesM);
        //pesquisa
        System.out.print("\nMap Pesquisa");
        System.out.println(clientesM.get(c2.getId()));


    }
}
