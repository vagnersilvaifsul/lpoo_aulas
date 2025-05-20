package model;

public class Gerente extends Funcionario {
    private double taxaDeBonificacao;

    public Gerente() {

    }

    public Gerente(String nome, String sobrenome, double salario, int quantidadeDeAcoes, double valorDaAcao, double taxaDeBonificacao) {
        super(nome, sobrenome, salario, quantidadeDeAcoes, valorDaAcao);
        this.taxaDeBonificacao = taxaDeBonificacao;
    }

    public double getTaxaDeBonificacao() {
        return taxaDeBonificacao;
    }

    public void setTaxaDeBonificacao(double taxaDeBonificacao) {
        this.taxaDeBonificacao = taxaDeBonificacao;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "taxaDeBonificacao=" + taxaDeBonificacao +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salario=" + salario +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                ", valorDaAcao=" + valorDaAcao +
                '}';
    }
}
