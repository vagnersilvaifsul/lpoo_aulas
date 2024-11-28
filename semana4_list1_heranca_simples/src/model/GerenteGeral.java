package model;

public class GerenteGeral extends Gerente {

    @Override
    public double getBonus() {
        return this.salario * 0.4;
    }

    @Override
    public String toString() {
        return "\nGerenteGeral{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
