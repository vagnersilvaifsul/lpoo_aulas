package model;

public class DesenvolvedorPleno extends Desenvolvedor {

    @Override
    public double getBonus() {
        return this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorPleno{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
