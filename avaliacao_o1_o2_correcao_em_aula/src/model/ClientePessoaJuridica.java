package model;

public class ClientePessoaJuridica extends Cliente {
    private String cnpj;

    public ClientePessoaJuridica() {

    }

    public ClientePessoaJuridica(String nome, String sobrenome, String email, int quantidadeDeAcoes, double valorDaAcao, String cnpj) {
        super(nome, sobrenome, email, quantidadeDeAcoes, valorDaAcao);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "\nClientePessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                ", valorDaAcao=" + valorDaAcao +
                '}';
    }
}
