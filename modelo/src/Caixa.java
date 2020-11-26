import java.awt.*;

public class Caixa
{
    Figura rt;
    private static int px, py, vel;

    Caixa(int px, int py)
    {
        rt = new Figura(px, py, 60);

    }

    public void render(Graphics g)
    {
        g.setColor(Color.MAGENTA);
        g.fillRect(
                (int)rt.getPx(), (int)rt.getPy(),
                rt.getTamanho()/2, rt.getTamanho());
    }

}
