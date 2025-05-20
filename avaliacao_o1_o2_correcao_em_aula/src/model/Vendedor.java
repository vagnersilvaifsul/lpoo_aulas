package model;

public class Vendedor extends Funcionario {
    private double taxaDecomissao;

    public Vendedor() {

    }

    public Vendedor(String nome, String sobrenome, double salario, int quantidadeDeAcoes, double valorDaAcao, double taxaDecomissao) {
        super(nome, sobrenome, salario, quantidadeDeAcoes, valorDaAcao);
        this.taxaDecomissao = taxaDecomissao;
    }

    public double getTaxaDecomissao() {
        return taxaDecomissao;
    }

    public void setTaxaDecomissao(double taxaDecomissao) {
        this.taxaDecomissao = taxaDecomissao;
    }

    @Override
    public String toString() {
        return "\nVendedor{" +
                "taxaDecomissao=" + taxaDecomissao +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salario=" + salario +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                ", valorDaAcao=" + valorDaAcao +
                '}';
    }
}
