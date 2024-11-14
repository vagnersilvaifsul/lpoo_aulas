package model;

/*
    O modificador de acesso abstract está marcando esta classe como
    "abastrata". Por definição, não é possível criar instâncias (objetos) de
    classes marcadas como abstract.
    Em outras palavras, marca-se uma classe como abstract para utilizar o
    conceito de abstração [...] lembrem quando o professor fez o projeto
    do sistema de contas bancárias. Ele começou projetando as classes filhas
    (ContaCorrente e ContaPoupança), percebeu que havia código repetido nas
    classes filhas, lançou mão do conceito de abstração para criar a classe Mãe (Conta)
    e colocar o código que repetia nela.
    Note, pelo exemplo apresentado anteriormente, que ao abstrair as classes
    filhas (classes concretas, as que realmente irá manipular no sistema),
    há a possibilidade de eliminar os códigos que repetem nas classes filhas,
    colocando-os na classe mãe.
 */

/*
    Note que o exemplo utilizado em sala de aula é o mais simplificado possível.
    A classe Conta tem apenas um atributo, um método para ler o valor do atributo,
    o getSaldo(), e 3 métodos para escrever no atributo, deposita(), saca(), e
    atualiza().
 */

public abstract class Conta {
    //Atributos
    protected double saldo;

    //Métodos
    public double getSaldo() {
        return this.saldo;
    }


    public void deposita(double valor) {
        this.saldo += valor;
    }

    /*
        Diferente da aplicação do modificador abstract antes de class,
        nos métodos, ao inserir esse modificador (o abstract), está se
        definindo que o método é abstrato. Isto é, que ele não terá algoritmo.
        Mas, por que se faz esse tipo de marcação em métodos?
        Se faz essa marcação em métodos quando quer obrigar as classes filhas
        a implementá-los, isto é, resolver o algoritmo. Geralmente isso nasce
        da necessidade de aplicar algoritmos diferentes nas classes filhas.

        Lembre! Na aula o professor demonstrou a aplicação do modificador abstract
        a partir do exemplo hipotético do seu cliente, que queria que o método saca
        seguisse regras diferentes nas classes filhas (que permitisse ficar negativa
        a conta em valores diferentes para as classes ContaCorrente e ContaPoupanca).

        Sempre que o algoritmo for diferente nas filhas, a classe mãe marca o método
        como abstract e deixa para as filhas o implementar. Pense assim: "se a classe
        mãe inserisse um algoritmo, ele seria igual para todas as suas filhas".

        Bom, uma dúvida que sempre surge nas aulas é:
        Mas, eu não poderia ter definido o método saca na mãe e sobreescrevê-lo
        nas filhas? Sim, é possível lançar mão do conceito de sobreescrita, como
        fazemos no toString(). Assim, teríamos algorimo na classe mãe e nas
        classes filhas.
     */
    public abstract void saca(double valor);

    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa/100);
    }

    /*
       Eita! :-() Este método também está sobreescrevendo o toString() da classe mãe.
     */
    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
