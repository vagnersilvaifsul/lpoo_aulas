package model;

import exception.EstoqueInsuficiente;

import java.math.BigDecimal;
import java.util.List;

public class Produto {
    private String sku;
    private String nome;
    private String descricao;
    private Integer estoque;
    private BigDecimal precoDeCusto;
    private BigDecimal precoDeVenda;
    //associações
    private List<Fornecedor> forncedor;

    public Produto() {
    }

    public Produto(String sku, String nome, String descricao, Integer estoque, BigDecimal precoDeCusto, BigDecimal precoDeVenda, List<Fornecedor> forncedor) {
        this.sku = sku;
        this.nome = nome;
        this.descricao = descricao;
        this.estoque = estoque;
        this.precoDeCusto = precoDeCusto;
        this.precoDeVenda = precoDeVenda;
        this.forncedor = forncedor;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public BigDecimal getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(BigDecimal precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public BigDecimal getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(BigDecimal precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public List<Fornecedor> getForncedor() {
        return forncedor;
    }

    public void setForncedor(List<Fornecedor> forncedor) {
        this.forncedor = forncedor;
    }

    public static void baixarEstoque(List<Item> itens){
        itens.forEach(i -> {
            if(i.getProduto().getEstoque() >= i.getQuantidade()) { //se tem estoque faz a baixa
                i.getProduto().setEstoque(i.getProduto().getEstoque() - i.getQuantidade());
            }else {
                try {
                    throw new EstoqueInsuficiente("Estoque insuficiente");
                } catch (EstoqueInsuficiente e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "sku='" + sku + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", estoque=" + estoque +
                ", precoDeCusto=" + precoDeCusto +
                ", precoDeVenda=" + precoDeVenda +
                ", forncedor=" + forncedor +
                '}';
    }
}
