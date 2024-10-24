public class Main2 {
    public static void main(String[] args) {
        //Alguns tipos primitivos
        int idade = 10;
        float altura = 2.0f;
        char caractere = 'a';
        boolean booleano = true;
        String string = "abc"; //Ops! Esse não é um tipo primitivo.
        Produto p1 = new Produto();
        System.out.println("Saída da linha 10:");
        System.out.println(p1.nome);
        System.out.println(p1.preco);
        //imprime
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(caractere);
        System.out.println(booleano);
        System.out.println(string);
    }
}

class Produto {
    String nome;
    double preco;
}
