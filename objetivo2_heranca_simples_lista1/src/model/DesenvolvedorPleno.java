package model;

public class DesenvolvedorPleno extends Desenvolvedor {

    public DesenvolvedorPleno() {
    }

    public DesenvolvedorPleno(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.salario * (5.0/100);
    }

    @Override
    public String toString() {
        return "DesenvolvedorPleno{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
