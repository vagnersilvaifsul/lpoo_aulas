package model;

public class Aviao extends Personagem{
    protected double z;

    public Aviao() {
    }

    public Aviao(double x, double y) {
        super(x, y);
    }

    public Aviao(double x, double y, int z) {
        super(x, y);
        this.z = z;
    }

    public void mover(double x, double y, double z) {
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um Aviao");
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
