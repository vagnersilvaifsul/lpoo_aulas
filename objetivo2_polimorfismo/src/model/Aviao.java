package model;

public class Aviao extends Personagem{
    private double z;

    public Aviao() {
    }

    public Aviao(double x, double y) {
        super(x, y);
    }

    public Aviao(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um aviao");
    }

    public void mover3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "\nAviao{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
