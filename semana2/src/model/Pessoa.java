package model;

public class Pessoa {
    //Membro do tipo Atributo
    private String nome;
    private int idade;

    //Membros do tipo Método (ou função ou procedimento)

    //Métodos construtores
    //construtor padrão
    public Pessoa(){}

    //construtor parametrizado
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "controller.Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
