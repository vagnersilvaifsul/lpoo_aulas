package controller;

import exception.PrecoDeCompraAcimaDe11_9Excecao;
import exception.PrecoVendaMaiorQue1000;
import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FornecimentoController {
    public static void main(String[] args) {
        //1f.a Faça o programa registrar dois fornecimentos, cada fornecimento para um produto diferente;
        Fornecedor f1 = new Fornecedor();
        List<Fornecedor> fornecedorList = new ArrayList<>();
        fornecedorList.add(f1);
        Produto p1 = new Produto("sku_1", "arroz", "Arroz Tio João pct 5kg", 100, BigDecimal.valueOf(10.9), BigDecimal.valueOf(100.9), fornecedorList);

        //Aqui está implementada a seguinte regra de negócio:
        //Se o preço de compra é maior que R$ 11,90 para a execução e lança uma exceção (no caso uma exceção personalizada).
        if(p1.getPrecoDeCompra().compareTo(BigDecimal.valueOf(11.9)) > 0){
            try {
                throw new PrecoDeCompraAcimaDe11_9Excecao("O preço de compra do produto está acima de 11.9");
            } catch (PrecoDeCompraAcimaDe11_9Excecao e) {
                System.err.println(e.getMessage());
                e.printStackTrace();
            }
//            } finally {
//                System.out.println("Executou no finally");
//            }
        }
        if(p1.getPrecoDeVenda().compareTo(BigDecimal.valueOf(1000.0)) > 0){
            try {
                throw new PrecoVendaMaiorQue1000("O preço de venda do produto está acima de 11.9");
            } catch (PrecoVendaMaiorQue1000 e) {
                System.err.println(e.getMessage());
                e.printStackTrace();
            }
        }
        Fornecimento fn1 = new Fornecimento(p1, f1, LocalDateTime.now(), 10, (p1.getPrecoDeCompra().multiply(BigDecimal.valueOf(10))));

        System.out.println(fn1);

    }
}
