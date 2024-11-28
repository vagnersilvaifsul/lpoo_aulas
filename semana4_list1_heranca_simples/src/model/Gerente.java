package model;

public class Gerente extends Funcionario {
    public Gerente() {
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
