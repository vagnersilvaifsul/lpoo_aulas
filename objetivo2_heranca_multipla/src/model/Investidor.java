package model;

public interface Investidor {
    //Todoss atributos são constantes

    //todos os métodos são públicos e abstratos
    String getTicker();
    void setTicker(String ticker);
    int getQuantidade();
    void setQuantidade(int quantidade);
}
