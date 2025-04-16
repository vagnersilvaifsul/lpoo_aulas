package model;

public class ContaSalarioPoupanca extends  ContaPoupanca{

    public ContaSalarioPoupanca() {
    }

    public ContaSalarioPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public String toString() {
        return "ContaSalarioPoupanca{" +
                "saldo=" + saldo +
                '}';
    }
}
