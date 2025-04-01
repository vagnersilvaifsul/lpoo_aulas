package model;

public class Conta {
    private double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

   public void deposita(double valor) {
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
   }

    public void saca(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public void atualiza(double taxa) {
        //this.saldo = this.saldo + (this.saldo * (taxa/100));
        this.saldo += this.saldo * (taxa/100);
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "saldo=" + saldo +
                '}';
    }
}
