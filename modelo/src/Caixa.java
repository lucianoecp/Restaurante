import java.awt.*;

public class Caixa
{
    Retangulo rt;
    private static int px, py, vel;

    Caixa(int px, int py)
    {
        rt = new Retangulo(px, py, 30, 60);

    }


    public void render(Graphics g)
    {
        g.setColor(Color.MAGENTA);
        g.fillRect(
                (int)rt.getPx(), (int)rt.getPy(),
                rt.getLadoMaior(), rt.getLadoMenor());
    }

}
