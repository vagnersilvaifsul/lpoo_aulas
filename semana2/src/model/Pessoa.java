package model;

public class Pessoa {
    //atributos
    public String nome;
    public int idade;
    public float altura;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //Métodos (que você conhece, do Paradigma Procedural, como Função (que retorna algo) ou Procedimento (que retorna void)
    @Override
    public String toString() {
        return "controller.Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
