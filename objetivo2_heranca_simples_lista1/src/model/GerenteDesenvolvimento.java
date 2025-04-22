package model;

public class GerenteDesenvolvimento extends Gerente {

    public GerenteDesenvolvimento() {
    }

    public GerenteDesenvolvimento(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.salario * (20.0/100);
    }

    @Override
    public String toString() {
        return "GerenteDesenvolvimento{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
