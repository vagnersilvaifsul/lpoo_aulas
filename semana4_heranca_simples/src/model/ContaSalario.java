package model;

public class ContaSalario extends Conta {
    /*
        Está sobreescrevendo o método saca da classe mãe.
    */
    @Override
    public void saca(double valor) {
        if(this.saldo - valor >= -5000.00) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    /*
       Eita! :-() Este método também está sobreescrevendo o toString() da classe mãe.
     */
    @Override
    public String toString() {
        return "ContaSalario{" +
                "saldo=" + saldo +
                '}';
    }
}
