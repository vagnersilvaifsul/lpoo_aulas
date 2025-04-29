package model;

public class Gerente extends Funcionario implements Investidor {

    private String ticker;
    private int quantidade;

    public Gerente() {
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public Gerente(String nome, double salario, String ticker, int quantidade) {
        super(nome, salario);
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    @Override
    public double getBonus() {
        return this.salario * (20.0/100);
    }

    @Override
    public String getTicker() {
        return this.ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public int getQdeCotas() {
        return this.quantidade;
    }

    @Override
    public void setQdeCotas(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "ticker='" + ticker + '\'' +
                ", quantidade=" + quantidade +
                ", nom e='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
