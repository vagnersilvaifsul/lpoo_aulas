package model;

import java.io.Serializable;

public class Gerente extends Funcionario implements Investidor {

    private String ticker;
    private int quantidade;

    public Gerente() {
    }

    public Gerente(String nome, double salario, String ticker, int quantidade) {
        super(nome, salario);
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
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
    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "ticker='" + ticker + '\'' +
                ", quantidade=" + quantidade +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
