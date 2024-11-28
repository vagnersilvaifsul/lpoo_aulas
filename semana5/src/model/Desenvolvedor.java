package model;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
