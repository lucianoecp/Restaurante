import java.awt.*;

public class Circulo extends Figura
{
    private int d;


    public Circulo(double px, double py, int diametro)
    {
        super(px, py);
        this.d = diametro;
    }


    public void setD(int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }

    @Override
    public void setDx(int dx) {
        super.setDx(dx);
    }

    @Override
    public int getDx() {
        return super.getDx();
    }

    @Override
    public void setDy(int dy) {
        super.setDy(dy);
    }

    @Override
    public int getDy() {
        return super.getDy();
    }

    @Override
    public void setPx(double px) {
        super.setPx(px);
    }

    @Override
    public double getPx() {
        return super.getPx();
    }

    @Override
    public void setPy(double py) {
        super.setPy(py);
    }

    @Override
    public double getPy() {
        return super.getPy();

    }


    public void moveToPosition(int x, int y)
    {
        System.out.println(getPx() + "/" + getPy());

        int numPassos = 50;

        setDx((int)((getPx() - x) * (-1) / numPassos));
        setDy((int)((getPy() - y) * (-1) / numPassos));

        if(getPx() != x && getPy() != y)
        {
            setPx(getPx() + getDx());
            setPy(getPy() + getDy());
        }




    }
}
