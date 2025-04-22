package model;

public class DesenvolvedorJunior extends Desenvolvedor {

    public DesenvolvedorJunior() {
    }

    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.salario * (5.0/100);
    }

    @Override
    public String toString() {
        return "DesenvolvedorJunior{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
