package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppController {

    public static void main(String[] args) {
        //1.1 Na estrutura do projeto, pacotes model + controller

        //1.2 Nas classes do pacote model

        //1.3 Instanciacao de objetos
        Socio cpf1 = new ClientePessoaFisica("Socio-cpf1", "Silva", "ana@email.com", 1000, 10.0, "111.111.111-11");
        Socio cpf2 = new ClientePessoaFisica("Socio-cpf2", "Silva", "socio2@email.com", 2000, 10.0, "222.222.222-22");
        Socio cpj1 = new ClientePessoaJuridica("Socio-cpj1", "Silva", "cpj1@email", 3000, 10.0, "4444.4444.4444/0001");
        Socio cpj2 = new ClientePessoaJuridica("Socio-cpj2", "Silva", "cpj2@email", 4000, 10.0, "5555.4444.4444/0001");
        Socio v1 = new Vendedor("v1", "Silva", 1000.0, 1000, 10.0, 5.0);
        Socio v2 = new Vendedor("v2", "Silva", 1000.0, 1000, 10.0, 5.0);
        Socio g1 = new Gerente("G1", "Silva", 2000.0, 2000, 10.0, 10.0);
        Socio g2 = new Gerente("G2", "Silva", 2000.0, 2000, 10.0, 10.0);

        //1.4 Impressão
        System.out.println(cpf1);
        System.out.println(cpf2);
        System.out.println(cpj1);
        System.out.println(cpj2);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(g1);
        System.out.println(g2);

        //1.5 - Manipulação de Coleções
        List<Socio> socioList = new ArrayList<>();
        socioList.add(cpf1);
        socioList.add(cpf2);
        socioList.add(cpj1);
        socioList.add(cpj2);
        socioList.add(v1);
        socioList.add(v2);
        socioList.add(g1);
        socioList.add(g2);
        System.out.println(socioList);

        //1.6 - Ordenação
        socioList.sort(Comparator.comparing(Socio::getQuantidadeDeAcoes).reversed());
        System.out.println(socioList);

        //1.7 - Contagem e Impressão
        int contV = 0;
        int contCpf = 0;
        for(Socio s : socioList) {
            if(s instanceof Vendedor) {
                contV++;
            }
            if(s instanceof ClientePessoaFisica) {
                contCpf++;
            }
            if(s instanceof Gerente){
                System.out.println(s);
            }
        }
        System.out.println("Quantidade de Vendedor: " + contV);
        System.out.println("Quantidade de ClientePessoaFisica: " + contCpf);

    }
}
