package model;

public class ContaCorrente extends Conta{
    /*
        Está sobreescrevendo o método saca da classe mãe.
     */
    public void saca(double valor) {
        if(this.saldo - valor >= -1000.00) {
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
        return "ContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }
}
