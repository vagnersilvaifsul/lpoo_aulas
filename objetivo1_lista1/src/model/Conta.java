package model;

public class Conta {
    //atributo
    private double saldo;

    //métodos (ou funções e procedimentos)
    public double getSaldo(){
        return this.saldo;
    }

    public void deposita(double valor){
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public void saca(double valor){
        if(this.saldo <= (valor + 2000.00)){
            //this.saldo = this.saldo - valor;
            this.saldo -= valor;
        }
    }

    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa/100);
    }
}
