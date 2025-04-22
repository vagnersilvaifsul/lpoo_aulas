package model;

public class DesenvolvedorSenior extends Desenvolvedor {
    public DesenvolvedorSenior() {
    }

    public DesenvolvedorSenior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.salario * (10.0/100);
    }

    @Override
    public String toString() {
        return "DesenvolvedorSenior{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
