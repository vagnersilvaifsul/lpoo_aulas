package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FornecimentoController {
    public static void main(String[] args) {
        //1f.a Faça o programa registrar dois fornecimentos, cada fornecimento para um
        //produto diferente;
        Fornecedor f1 = new Fornecedor();
        List<Fornecedor> fornecedorList = new ArrayList<>();
        fornecedorList.add(f1);
        Produto p1 = new Produto("sku_1", "arroz", "Arroz Tio João pct 5kg", 100, BigDecimal.valueOf(11.9), BigDecimal.valueOf(19.9), fornecedorList);
        Fornecimento fn1 = new Fornecimento(p1, f1, LocalDateTime.now(), 10, (p1.getPrecoDeCompra().multiply(BigDecimal.valueOf(10))));

        Produto p2 = new Produto("sku_1", "feijão", "Arroz Tordilho pct 1kg", 100, BigDecimal.valueOf(3.9), BigDecimal.valueOf(8.9), fornecedorList);
        Fornecimento fn2 = new Fornecimento(p2, f1, LocalDateTime.now(), 10, (p2.getPrecoDeCompra().multiply(BigDecimal.valueOf(10))));

        //1f.b Imprima o relatório de fornecimentos (todos os fornecimentos realizados),
        //contendo, os dados do produto, os dados do fornecedor, o total de cada
        //fornecimento, e o total de todos os fornecimentos;
        List<Fornecimento> fornecimentoList = new ArrayList<>();
        fornecimentoList.add(fn1);
        fornecimentoList.add(fn2);

        BigDecimal total = BigDecimal.ZERO;
        for(Fornecimento f : fornecimentoList) {
            total = total.add(f.getTotal());
        }
        System.out.println(fornecimentoList);
        System.out.println("Total dos Fornecimentos: " + total);

    }
}
