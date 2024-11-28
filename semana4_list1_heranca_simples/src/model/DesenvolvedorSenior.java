package model;

public class DesenvolvedorSenior extends Desenvolvedor {

    @Override
    public double getBonus() {
        return this.salario * 0.1;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorSenior{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
