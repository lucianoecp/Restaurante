public class Retangulo extends Figura
{
    private int ladoMenor, ladoMaior;

    public Retangulo(double px, double py, int l, int L)
    {
        super(px, py);
        this.ladoMaior = l;
        this.ladoMenor = L;
    }

    public int getLadoMaior() {
        return ladoMaior;
    }

    public void setLadoMaior(int ladoMaior) {
        this.ladoMaior = ladoMaior;
    }

    public int getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(int ladoMenor) {
        this.ladoMenor = ladoMenor;
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