package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Fornecimento {

    private LocalDateTime data_hora;
    private int quantidade;
    private BigDecimal total;

    //associações
    private Produto produto;
    private Fornecedor fornecedor;


    public Fornecimento() {
    }

    public Fornecimento(Produto produto, Fornecedor fornecedor, LocalDateTime data_hora, int quantidade, BigDecimal total) {
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.data_hora = data_hora;
        this.quantidade = quantidade;
        this.total = total;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public LocalDateTime getData_hora() {
        return data_hora;
    }

    public void setData_hora(LocalDateTime data_hora) {
        this.data_hora = data_hora;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "\nFornecimento{" +
                "data_hora=" + data_hora +
                ", quantidade=" + quantidade +
                ", total=" + total +
                ", produto=" + produto +
                '}';
    }
}
