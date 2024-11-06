package controller;

public class StaticController {
    public static void main(String[] args) {
        //StaticController controller = new StaticController();
        System.out.println(StaticController.potenciacao(2, 2));
        System.out.println(StaticController.radiciacao(25));
    }

    public static double potenciacao(int base, int exponte){
//        double total = 0.0;
//        for (int i = 0; i < exponte; i++) {
//            total = base * base;
//        }
        return Math.pow(base, exponte);
    }

    public static double radiciacao(int valor){
        return Math.sqrt(valor);
    }
}
