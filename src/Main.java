public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//
//        int a = 6;
//        int b = 5;
//        System.out.println("a=" + a);
//        System.out.println("b=" + b);
//
//        if (b > a) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a < b");
//        }
//
//        for (int i = 0; i < 9; i++) {
//            System.out.println("i=" + i);
//        }
//
//        int cont = 0;
//        while (cont < 9) {
//            imprimir(cont);
//            cont++;
//        }
        Pessoa pessoa = new Pessoa();
        System.out.println(pessoa);
    }

//    public static void imprimir(int value){
//        System.out.println("value=" + value);
//    }
}

class Pessoa{
    String nome;
    int idade;
}
