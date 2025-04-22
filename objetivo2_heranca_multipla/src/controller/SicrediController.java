package controller;

import model.Cliente;
import model.Funcionario;
import model.Gerente;

public class SicrediController {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Ana", 1000.0);
        Cliente c1 = new Cliente("Rafael", "Silva");
        g1.setTicker("SICR3");
        g1.setQuantidade(1000);
        c1.setTicker("SICR3");
        c1.setQuantidade(1000);
        System.out.println("Gerente=" + g1);
        System.out.println("Cliente=" + c1);
    }
}
