package model;

public class DesenvolvedorJunior extends Desenvolvedor {

    @Override
    public double getBonus() {
        return this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorJunior{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
