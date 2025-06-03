package controller;

import exception.PrecoDeCompraAcimaDe11_9Excecao;

public class ExemploDidatico {

    public static void main(String[] args) throws PrecoDeCompraAcimaDe11_9Excecao {
        double numerador = 10.0;
        double denominador = 0.0;
        System.out.println(segundoMetodo(numerador, denominador));

        //criar minhas próprias classes de exceção
        //throw new MinhaExcecao("Eu lancei!");
    }

    public static double segundoMetodo(double numerador, double denominador){
        return dividir(numerador, denominador);
    }

    public static double dividir(double numerador, double denominador){
        try{
            if(denominador == 0.0){
                throw new ArithmeticException("Div/Zero");
            }
            return numerador/denominador;
        } catch(Exception e){
           e.printStackTrace();
           return 0.0;
        }
    }
}
