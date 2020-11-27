import java.awt.*;

public class Garcom extends Pessoa{

    private double px, py;
    private int dx, dy;
    private final int tamanho = 40;

    public Garcom(int numGarcom)
    {
        super(numGarcom);
    }
    public void atenderMesa(Mesa mesa)
    
    {  
        System.out.println("\nO Garcom" + this.getNomePessoa() + " Atendeu a Mesa " + mesa.getNumMesa() + "");
        mesa.setAtendimento();
    }

    public void setGarcom(double px, double py){
        this.px = px;
        this.py = py;
        this.dx = 1;
        this.dx = 1;
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

    // movimenta o elemento da posição atual até a posição (x, y)
    // em 50 passos
    public void moveToPosition(int x, int y)
    {
        int numPassos = 50;

        setDx((int)((getPx() - x) * (-1) / numPassos));
        setDy((int)((getPy() - y) * (-1) / numPassos));

        if(getPx() != x && getPy() != y)
        {
            setPx(getPx() + getDx());
            setPy(getPy() + getDy());
        }
    }

    public void render(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillOval((int)px, (int)py, tamanho, tamanho);
        g.setColor(Color.BLACK);
        g.drawOval((int)px, (int)py, tamanho, tamanho);
    }

    
}
