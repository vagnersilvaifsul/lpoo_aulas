package model;

public abstract class Funcionario implements Socio {

    protected String nome;
    protected String sobrenome;
    protected double salario;
    protected  int quantidadeDeAcoes;
    protected double valorDaAcao;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, double salario, int quantidadeDeAcoes, double valorDaAcao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.quantidadeDeAcoes = quantidadeDeAcoes;
        this.valorDaAcao = valorDaAcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setQuantidadeDeAcoes(int quantidadeDeAcoes) {
        this.quantidadeDeAcoes = quantidadeDeAcoes;
    }

    public void setValorDaAcao(double valorDaAcao) {
        this.valorDaAcao = valorDaAcao;
    }

    @Override
    public int getQuantidadeDeAcoes() {
        return this.quantidadeDeAcoes;
    }

    @Override
    public double getValorDaAcao() {
        return this.valorDaAcao;
    }
}
