public class Main {
    public static void main(String[] args) {
        /*
            Passo 1:
            Eu comecei apresentado os tipos primitivos (que vocês já conhecem lá da disciplina de Lógica e Programação).
            Note que uma linguagem tipada, declaramos uma variável com essa sintaxe geral:
                tipoDaVariável nomeDaVariável = valorDaVariável;
            É possível só declarar a variável, sem determinar um valor para ela, assim:
                tipoDaVariável nomeDaVariável;
            Só que cada variável tem que ter um valor na memória, senão ela conteria lixo. O compilador resolve essa parada atribuindo um valor, quando o
            programador não o define.
            Para numéricos ele define o Zero (isto é, int, float e double recebem o valor Zero).
            Para o char ele exige uma atribuição (isto é, um valor).
            Para o boolean exige uma atribuição (isto é, um valor).
         */
        int idade = 10; //o 10 é um literal. Quando o compilador encontra essa "string" a interpreta como um valor numérico, do tipo Inteiro
        float altura = 2.0f; //o 2.0 é um literal (Note que o ponto flutuante é necessário nesse literal. Isso diz para o compilador que ele é um numérico de ponto flutuante). Quando o compilador encontra essa "string" a interpreta como um valor numérico, do tipo double. Para ensiná-lo a interpretar como float é necessário o f no final.
        char caractere = 'a'; //o 'a' é um literal de caractere. O compilador não tem problemas para interpretá-lo, desde que, esteja entre aspas SIMPLES.
        boolean booleano = true; //o true é um literal de boolean. O compilador não tem problemas para interpretá-lo, desde que, utilizemos as palavras reservadas true ou false.
        String string = "abc"; //o "abc" é um literal de uma String. O compilador não tem problemas para interpretá-lo, desde que, esteja entre aspas DUPLAS.
        //imprimindo essa variáveis
        //System -> dá acesso ao sistema operacional da máquina
        //out -> saída padrão do sistema operacional (no caso, um console de saída. Uma janela de prompt de saída para a aplicação).
        //println -> procedimento que imprime de fato o valor da variável ou de um literal do TIPO STRING. É possível concatenar String com variáveis adicionando o operador + entre eles.
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(caractere);
        System.out.println(booleano);
        System.out.println(string);


        /*
            Passo 2:
            Depois, para contrastar, eu criei uma variável do TIPO DO PROGRAMADOR. Bom, ela não existia, então eu tive que utilizar o meu conhecimento do
            PARADIGMA DA ORIENTAÇÃO A OBJETO (POO) para resolver o problema.
            Como eu resolvi? Eu criei uma class e dei o nome a ela de Pessoa, o tipo que eu coloquei ao declarar a variável, assim:
                Pessoa pessoa1 = new Pessoa();
            Notem que a forma geral de declarar uma variável está aí:
                tipoDaVariável nomeDaVariável = valorDaVariável;
            A questão que eu tinha que resolve era o de criar o TIPO PESSOA (que eu resolvi criando uma class).

            Então podemos deduzir que:
            1. Em POO nós podemos (ou deveria dizer DEVEMOS) criar nossos próprios TIPOS DE DADOS. Notem, isso nos liberta da necessidade de utilizar somente
                os tipos de dados primitivos para programar (ou a união deles em um tipo STRUCT);
            2. Em POO as class representam objetos do mundo real ou imaginário;
            3. Em POO as class representam um TIPO DE DADO que, geralmente, os nomeamos como TIPO DE DADO DO PROGRAMADOR;
            4. Em POO as class representam a especificação de cada objeto (uma variável mais complexa que os tipos primitivos) que criamos na memória RAM;
            5. Que temos que nos aprofundar na 'anatomia' das class, pois elas representam os novos TIPOS DE DADOS que vamos utilizar de agora em diante para programar.
         */
        Pessoa pessoa1 = new Pessoa(); //tipoDaVariável nomeDaVariável = valorDaVariável; - Gente! Isso não mudou. A diferença é que do lado direito não tenho um valor, mas uma chamada para um método (um procedimento)
        pessoa1.nome = "Ana"; //eu posso utilizar a variável (conhecida como objeto, ou instância de uma class) para atribuir valores aos seus atributos
        Pessoa pessoa2 = new Pessoa(); //a partir do tipo class, nesse caos Pessoa, é possível criar n objetos na memória RAM, cada um com o seu próprio valor nos atributos
        pessoa2.nome = "Júlia";
        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Adão";
        System.out.println(pessoa1); //para imprimir um objeto o compilador necessita de um conversor de Pessoa para String. Note que eu o adicionei lá na classe, ele é um método e chama-se toString()
        System.out.println(pessoa2);
        System.out.println(pessoa3);

        /*
            Passo 3:
            Eu mostrei para vocês um slide com o FLUXO PARA CRIAÇÃO DE CLASSES NO POO, que está em https://drive.google.com/file/d/15A3yjncdNM1BLHkNyVFOjwdaXd-jTfQb/view?usp=sharing
            Note que essas etapas compreendem:
            1. Identificar um conjunto de objetos que contém características comuns, como Automóvel no exemplo;
            2. Modelar esses objetos em uma class (para modelar uma classe se utiliza o Diagrama de Classes da UML);
            3. Escrever esta classe em uma tecnologia. Nesse exemplo, em Java.
         */
        Automovel automovel1 = new Automovel();
        Automovel automovel2 = new Automovel();
        System.out.println(automovel1);
        System.out.println(automovel2);
    }
}

/*
    Relativo ao Passo 2

    Uma classe representa a especificação de um conjunto de objetos que se pretende manusear numa aplicação Orientada a Objetos.
    A partir de uma única classe é possível criar uma infinidade de objetos (que contém a mesma especificação, mesma classe)

    Na linguagem do dia-a-dia dizemos que uma classe é um TIPO DO PROGRAMADOR, em contraste com os TIPOS PRIMITIVOS.
 */
class Pessoa {
    //atributos
    String nome;
    int idade;
    float altura;

    //Métodos (que você conhece, do Paradigma Procedural, como Função (que retorna algo) ou Procedimento (que retorna void)
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

/*
    Relativo ao Passo 3
 */
class Automovel{}
