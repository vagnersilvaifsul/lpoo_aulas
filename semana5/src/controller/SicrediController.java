package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class SicrediController {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rita", "Silva", "SICR3", 1000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Ana", 5000.00);
        Gerente gerente = new Gerente("Tereza", 15000.00, "SICR3", 1000);

//        Funcionario funcionario = new Funcionario();
//        Investidor investidor = new Investidor();

        //Representa todos os funcionarios
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(desenvolvedor);
        funcionarios.add(gerente);
        double acumuladorFolhaDePagamento = 0;
        for (Funcionario funcionario : funcionarios) {
            acumuladorFolhaDePagamento += funcionario.getSalario();
        }
        System.out.println("Total da folha de pagamento:");
        System.out.println(acumuladorFolhaDePagamento);

        //Representa todos os investidores
        List<Investidor> investidores = new ArrayList<>();
        investidores.add(gerente);
        investidores.add(cliente);
    }
}
