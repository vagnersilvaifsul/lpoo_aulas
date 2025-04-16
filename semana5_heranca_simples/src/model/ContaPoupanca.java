package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "saldo=" + this.saldo +
                '}';
    }
}
