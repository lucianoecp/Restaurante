import java.awt.*;

public class Figura
{
    private double px, py;
    private int dx, dy;
    private int tamanho;

    private static Image Fundo;

    public Figura(double px, double py, int tamanho)
    {
        this.px = px;
        this.py = py;
        this.tamanho = tamanho;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public static void setFundo(Image fundo) {
        Fundo = fundo;
    }

    public static Image getFundo() {
        return Fundo;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDx() {
        return dx;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getDy() {
        return dy;
    }

    public void setPx(double px) {
        this.px = px;
    }

    public double getPx() {
        return px;
    }

    public void setPy(double py) {
        this.py = py;
    }

    public double getPy() {
        return py;
    }
}

