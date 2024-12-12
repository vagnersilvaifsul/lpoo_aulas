package model;

public class Cliente implements Associado{

    private int qdeCotas;
    private String nome;

    public Cliente() {
    }

    public Cliente(int qdeCotas, String nome) {
        this.qdeCotas = qdeCotas;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public int getQuantidadeDeCotas() {
        return this.qdeCotas;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "qdeCotas=" + qdeCotas +
                ", nome='" + nome + '\'' +
                '}';
    }
}
