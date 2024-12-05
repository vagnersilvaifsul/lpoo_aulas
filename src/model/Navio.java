package model;

public class Navio extends Personagem{

    public Navio() {
    }

    public Navio(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um Navio");
    }

    @Override
    public String toString() {
        return "Navio{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
