package model;

public class Pessoa {
    public String nome;
    public int idade;

    @Override
    public String toString() {
        return "controller.Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
