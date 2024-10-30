package controller;

import model.Carro;

public class CarroController {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro(
                "Fiat",
                "Uno",
                2000);
    }
}
