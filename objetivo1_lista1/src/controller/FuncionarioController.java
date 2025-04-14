package controller;

import model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        //a está na estrutura do projeto

        //b está no pacote model

        //c
        //i
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        //ii
        Funcionario f3 = new Funcionario(3, "Ana", 3000.0);
        Funcionario f4 = new Funcionario(4, "Rafael", 4000.0);
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
        f1.setId(1);
        f1.setNome("Fulano de 1");
        f1.setSalario(1000.0);
        f2.setId(2);
        f2.setNome("Fulano de 2");
        f2.setSalario(2000.0);
        f3.setNome("Fulano de 3");
        f3.setSalario(3000.0);
        f4.setNome("Fulano de 4");
        f4.setSalario(4000.0);
        f5.setId(5);
        f5.setNome("Fulano de 5");
        f5.setSalario(5000.0);
        f6.setId(6);
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


        //2
        //2a
        //Declarando um objeto (uma variável)  do tipo List (ou ArrayList)
        List<Funcionario> funcionarioList = new ArrayList<>();
        //adicionando objetos à coleção
        funcionarioList.add(f1);
        funcionarioList.add(f2);
        funcionarioList.add(f3);
        funcionarioList.add(f4);
        funcionarioList.add(f5);
        funcionarioList.add(f6);
        //imprime a coleção
        System.out.println("Imprimindo a coleção do tipo List");
        System.out.println(funcionarioList.toString());
        //Imprimindo elemento por elemento
        //1a. estratégia com fori (vamos evitar a sua utilização)
        for (int i = 0; i < funcionarioList.size(); i++) {
            System.out.println(funcionarioList.get(i).toString());
        }
        //for each (do java 7+) !!!!! Vamos utilizar esta
        for (Funcionario f : funcionarioList) {
            System.out.println(f.toString());
        }
        //for each (do java 8+)
        funcionarioList.forEach(System.out::println);

        //Ordenação
        System.out.println("\n\n");
        System.out.println("List ordenada:");
        funcionarioList.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println(funcionarioList.toString());

        //Pesquisa
        System.out.println("\n\n");
        System.out.println("Resultado da pesquisa");
        //abordagem com fori (não vamos utilizar esta abordagem)
        for (int i = 0; i < funcionarioList.size(); i++) {
            if(2000.00 == funcionarioList.get(i).getSalario()) {
                System.out.println(funcionarioList.get(i).toString());
            }
        }
        //abordagem com forEach do Java 7+
        for (Funcionario f : funcionarioList) {
            if(2000.00 == f.getSalario()) {
                System.out.println(f.toString());
            }
        }
        //abordagem com forEach do Java 8+ (vamos evitar)
        funcionarioList.forEach(f -> {
            if(2000.00 == f.getSalario()) {
                System.out.println(f.toString());
            }
        });

        //solução da Lista 1
        //Declarando um objeto (uma variável) do tipo List (ou ArrayList)
        //2a
        List<Funcionario> funcionarioList2 = new ArrayList<>();

        //2b está na classe de modelo

        //2c está na criação ou manutenção dos objetos neste controlador

        //2d
        //adicionando objetos à coleção
        funcionarioList2.add(f1);
        funcionarioList2.add(f2);
        funcionarioList2.add(f3);
        funcionarioList2.add(f4);
        funcionarioList2.add(f5);
        funcionarioList2.add(f6);

        //2e
        //imprime a coleção
        System.out.println("Imprimindo a coleção do tipo List");
        System.out.println(funcionarioList2);

        //2f
        funcionarioList2.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println(funcionarioList2);

        //2g
        //pesquisa por força bruta
        //abordagem com forEach do Java 7+
        for (Funcionario f : funcionarioList2) {
            if(3 == f.getId()) {
                System.out.println(f);
                break;
            }
        }
        //pesquisa binária
        funcionarioList2.sort(Comparator.comparing(Funcionario::getId));
        System.out.println(
                funcionarioList2.get(
                        Collections.binarySearch(
                                funcionarioList2,
                                new Funcionario(3, "Ana", 3000.0),
                                Comparator.comparing(Funcionario::getId)
                        )
                )
        );

        //Coleção do tipo Map (Estrutura de dados do tipo Map)
        //1. Declara e popula a coleção
        //List<Funcionario> funcionarioList2 = new ArrayList<>();
        System.out.println("\n\n");
        System.out.println("Coleção do tipo Map");
        Map<Integer, Funcionario> funcionarioMap = new HashMap<>();
        funcionarioMap.put(f1.getId(), f1);
        funcionarioMap.put(f2.getId(), f2);
        funcionarioMap.put(f3.getId(), f3);
        funcionarioMap.put(f4.getId(), f4);
        funcionarioMap.put(f5.getId(), f5);
        funcionarioMap.put(f6.getId(), f6);
        System.out.println(funcionarioMap);

        //2. Ordenação
        //O Map não permite ordenação

        //3. Pesquisa
        System.out.println("\n\n");
        System.out.println("Pesquisa na coleção do tipo Map");
        System.out.println(funcionarioMap.get(f3.getId()));


        /*

            Como saber se dois objetos são iguais?

            Uso dos métodos equals e do hashCode.

            O equals serve para comparar dois objetos.

            O hashCode é uma propriedade que identifica o objeto de forma inequívoca.

            Por padrão, a classe Object gera o hashCode como um número inteiro identificador do objeto.
            A cada nova execução esse número é recalculado, mas, ele é o mesmo durante toda a execução.
            O hashCode e o equals podem ser implementados na classe, variando a chave que identifica o objeto.

         */
        Funcionario tf1 = new Funcionario(21, "Ana", 21000.00);
        Funcionario tf2 = new Funcionario(21, "Ana", 21000.00);
        if(tf1.equals(tf2)){
            System.out.println("tf1 = tf2");
            System.out.println(tf1.hashCode());
            System.out.println(tf2.hashCode());
        } else {
            System.out.println("tf1 != tf2");
            System.out.println(tf1.hashCode());
            System.out.println(tf2.hashCode());
        }
    }

}
