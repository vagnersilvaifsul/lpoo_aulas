package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario {
    private double taxaDeCommisao;
    private Regiao regiao;
    private List<Pedido> pedidos = new ArrayList<>();

    public Vendedor() {

    }

    public Vendedor(Long matricula, String nome, String email, String telefone, BigDecimal salario, double taxaDeCommisao, Regiao regiao, List<Pedido> pedidos) {
        super(matricula, nome, email, telefone, salario);
        this.taxaDeCommisao = taxaDeCommisao;
        this.regiao = regiao;
        this.pedidos = pedidos;
    }

    public Vendedor(Long matricula, String nome, String email, String telefone, BigDecimal salario, double taxaDeCommisao, Regiao regiao) {
        super(matricula, nome, email, telefone, salario);
        this.taxaDeCommisao = taxaDeCommisao;
        this.regiao = regiao;
    }

    public double getTaxaDeCommisao() {
        return taxaDeCommisao;
    }

    public void setTaxaDeCommisao(double taxaDeCommisao) {
        this.taxaDeCommisao = taxaDeCommisao;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "\nVendedor{" +
                "taxaDeCommisao=" + taxaDeCommisao +
                ", regiao=" + regiao +
                ", pedidos=" + pedidos +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", salario=" + salario +
                '}';
    }
}
