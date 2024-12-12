package model;

public class ContaCorrente extends Conta implements Associado{

    private int qdeCotas;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(double saldo, int qdeCotas) {
        super(saldo);
        this.qdeCotas = qdeCotas;
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa/100);
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public int getQuantidadeDeCotas() {
        return this.qdeCotas;
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "qdeCotas=" + qdeCotas +
                ", saldo=" + saldo +
                '}';
    }
}
