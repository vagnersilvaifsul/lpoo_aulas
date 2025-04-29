package model;

public class Submarino extends Personagem{

    public Submarino() {
    }

    public Submarino(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um submarino");
    }

    @Override
    public String toString() {
        return "\nSubmarino{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
