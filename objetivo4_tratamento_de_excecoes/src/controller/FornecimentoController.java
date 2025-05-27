package controller;

import exception.MinhaExcecao;
import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FornecimentoController {
    public static void main(String[] args) throws MinhaExcecao {
        //1f.a Faça o programa registrar dois fornecimentos, cada fornecimento para um produto diferente;
        Fornecedor f1 = new Fornecedor();
        List<Fornecedor> fornecedorList = new ArrayList<>();
        fornecedorList.add(f1);
        Produto p1 = new Produto("sku_1", "arroz", "Arroz Tio João pct 5kg", 100, BigDecimal.valueOf(11.9), BigDecimal.valueOf(19.9), fornecedorList);

        //Aqui está implementada a seguinte regra de negócio:
        //Se o preço de compra é maior que R$ 11,90 para a execução e lança uma exceção (no caso uma exceção personalizada).
        if(p1.getPrecoDeCompra().compareTo(BigDecimal.valueOf(11.9)) > 0){
            throw new MinhaExcecao("O preço do produto está acima de 11.9");
        }
        Fornecimento fn1 = new Fornecimento(p1, f1, LocalDateTime.now(), 10, (p1.getPrecoDeCompra().multiply(BigDecimal.valueOf(10))));

        Produto p2 = new Produto("sku_1", "feijão", "Arroz Tordilho pct 1kg", 100, BigDecimal.valueOf(3.9), BigDecimal.valueOf(8.9), fornecedorList);
        Fornecimento fn2 = new Fornecimento(p2, f1, LocalDateTime.now(), 10, (p2.getPrecoDeCompra().multiply(BigDecimal.valueOf(10))));

        //Ao invés de utilizar um if-else para implementar a regra de negócio, usa-se o lançamento de uma exceção com throw.
        //Isso ajuda a parar a execução do código quando uma regra não é atendida.
//        if(p1.getPrecoDeCompra().compareTo(BigDecimal.valueOf(11.9)) <= 0){
//
//        } else {
//            System.out.println("O preço não está abaixo de 11.90");
//        }

    }
}
