package model;

public abstract class Conta {
    protected double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void atualizaSaldo(double taxa) {
        this.saldo += this.saldo * (taxa/100);
    }

    //Não necessita o toString, pois a classe é abastrata
}
