package controller;

import model.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PedidoController {
    public static void main(String[] args) {
        //1a. Nos pacotes do projeto
        //1b. No pacote model

        //1c Faça a aplicação realizar um pedido.
        Vendedor vendedor = new Vendedor(111L, "Vendedor 1", "vendedor_1@email.com", "5555-1234", BigDecimal.valueOf(1000.0), 5.0, Regiao.SUL);
        Produto produto1 = new Produto("111", "Arroz", "Tordilho pc  5kg", 100, BigDecimal.valueOf(10.9), BigDecimal.valueOf(19.9), List.of(new Fornecedor("Tordilho")));
        Item item1 = new Item(1000, produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(1000)), Situacao.ATIVO, produto1);
        Item item2 = new Item(10, produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(10)), Situacao.ATIVO, produto1);
        List<Item> carrinho = new ArrayList<>();
        carrinho.add(item1);
        carrinho.add(item2);
        BigDecimal totalPedido = BigDecimal.ZERO;
        for(Item item : carrinho) {
            totalPedido = totalPedido.add(item.getTotal());
        }
        Produto.baixarEstoque(carrinho);
        Pedido pedido1 = new Pedido(
                "111",
                LocalDateTime.now(),
                totalPedido,
                vendedor,
                Estado.ABERTO,
                carrinho);
        System.out.println(pedido1);

        //1d.
        Item item4 = new Item(5, produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(5)), Situacao.ATIVO, produto1);
        Item item5 = new Item(5, produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(5)), Situacao.ATIVO, produto1);
        carrinho.clear();
        carrinho.add(item4);
        carrinho.add(item5);
        totalPedido = BigDecimal.ZERO;
        for(Item item : carrinho) {
            totalPedido = totalPedido.add(item.getTotal());
        }
        Produto.baixarEstoque(carrinho);
        Pedido pedido2 = new Pedido(
                "222",
                LocalDateTime.now(),
                totalPedido,
                vendedor,
                Estado.ABERTO,
                carrinho);
        System.out.println("\n\n Segundo Pedido:");
        System.out.println(pedido2);

        //1e.
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        System.out.println("\n\nRelatório de Vendas:");
        System.out.println(pedidos);

        //1f.
        BigDecimal totalVendas = BigDecimal.ZERO;
        for(Pedido pedido : pedidos) {
            totalVendas = totalVendas.add(pedido.getTotal());
        }
        System.out.println("\nTotal de vendas= " + totalVendas);

        //1g.
        Produto produtoTJ = new Produto("111", "Arroz", "Tio João pc  5kg", 100, BigDecimal.valueOf(10.9), BigDecimal.valueOf(19.9), null);
        Fornecedor fornecedorTJ = new Fornecedor("111", "Tio João", "tiojoao@email.com", "5555-9876", List.of(produtoTJ));
        Fornecimento fornecimento1 = new Fornecimento(LocalDateTime.now(), 30, produtoTJ.getPrecoDeCusto().multiply(BigDecimal.valueOf(30)),fornecedorTJ, produtoTJ);
        System.out.println("\n\n Fornecimento TJ:");
        produtoTJ.setEstoque(produtoTJ.getEstoque() + fornecimento1.getQuantidade());
        System.out.println(fornecimento1);

        //1h.
        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fornecimento1);
        BigDecimal totalFornecimentos = BigDecimal.ZERO;
        for(Fornecimento fornecimento : fornecimentos) {
            totalFornecimentos = totalFornecimentos.add(fornecimento.getTotal());
        }
        System.out.println("\nTotal de fornecimentos= " + totalFornecimentos);
    }
}
