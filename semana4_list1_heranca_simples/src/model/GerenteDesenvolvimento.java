package model;

public class GerenteDesenvolvimento extends Gerente {

    @Override
    public double getBonus() {
        return this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "\nGerenteDesenvolvimento{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
