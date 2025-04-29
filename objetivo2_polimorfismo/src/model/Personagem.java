package model;

public abstract class Personagem {
    protected double x;
    protected double y;

    public Personagem() {
    }

    public Personagem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract void desenhar();
}
