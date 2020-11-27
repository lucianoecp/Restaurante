import java.awt.*;

public class Cliente extends Pessoa{

    private Conta conta = new Conta();

    private double px, py;
    private int dx,dy;
    private final int tamanho = 35;

    public Cliente(int numCliente,String nomeCliente)
    {   
        super(numCliente,nomeCliente);
    }
    public String realizaPedido(String nomePedido)
    {
        return nomePedido; 
    }
    public void setContaPaga()
    {
        this.conta.setPagamento();
    }
    public boolean isPago()
    {
        return this.conta.isPago();
    }

    public void setCliente(double px, double py){
        this.px = px;
        this.py = py;
        this.dx = 1;
        this.dx = 1;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getDy() {
        return dy;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDx() {
        return dx;
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

    // movimenta o elemento da posição atual até a posição (x, y)
    // em 50 passos
    public void moveToPosition(int x, int y)
    {
        int numPassos = 50;
        boolean movido = false;

        while(!movido)
        {   setDx((int)((getPx() - x) * (-1) / numPassos));
            setDy((int)((getPy() - y) * (-1) / numPassos));

            if(getPx() != x && getPy() != y)
            {
                setPx(getPx() + getDx());
                setPy(getPy() + getDy());


            }else
            {
                movido = true;
            }
        }
    }





    public void render(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.fillOval((int)px, (int)py, tamanho, tamanho);

        g.setColor(Color.WHITE);
        g.drawOval((int)px, (int)py, tamanho, tamanho);
    }

}
