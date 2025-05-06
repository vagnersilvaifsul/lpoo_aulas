package model;

public class Cliente implements Associado {

    private int qdeDeCotas;
    private String nome;

    public Cliente() {
    }

    public Cliente(int qdeDeCotas, String nome) {
        this.qdeDeCotas = qdeDeCotas;
        this.nome = nome;
    }

    @Override
    public int getQdeCotas() {
        return this.qdeDeCotas;
    }

    public int getQdeDeCotas() {
        return qdeDeCotas;
    }

    public void setQdeDeCotas(int qdeDeCotas) {
        this.qdeDeCotas = qdeDeCotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "qdeDeCotas=" + qdeDeCotas +
                ", nome='" + nome + '\'' +
                '}';
    }
}
