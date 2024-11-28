package model;

public interface Investidor {

    //Todoo atributo é public e constante (final)
    //public final int qdeDeCotas = 0;

    String getTicker();

    void setTicker(String ticker);

    int getQuantidade();

    void setQuantidade(int quantidade);
}
