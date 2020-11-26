public class Quadrado extends Figura
{
    private int l;

    public Quadrado(double px, double py, int lado)
    {
        super(px, py);
        this.l = lado;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
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
}
