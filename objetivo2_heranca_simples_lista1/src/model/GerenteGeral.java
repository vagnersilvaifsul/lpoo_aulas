package model;

public class GerenteGeral extends Gerente{

    public GerenteGeral() {
    }

    public GerenteGeral(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.salario * (40.0/100);
    }

    @Override
    public String toString() {
        return "GerenteGeral{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
