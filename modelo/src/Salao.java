import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.security.DrbgParameters.Reseed;


public class Salao
{

    private static int l, h;

    Salao(int largura, int altura)
    {
        this.l = largura;
        this.h = altura;

    }

    public BufferedImage criarImagem()
    {
        OpenRestaurante restaurante = new OpenRestaurante();
        BufferedImage buffer = new BufferedImage(l, h,
                BufferedImage.TYPE_INT_RGB);

        Graphics g = buffer.createGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0,0, l, h);
        g.setColor(Color.CYAN);
        g.fillRect(l/10,0,(int) (l),(int) (h));

        // entrada
        g.setColor(Color.RED);
        g.fillRect(l/10, 0, (int) (l*0.01), (int) (h*0.2));

        // saida
        g.setColor(Color.RED);
        g.fillRect((int)(l-8), (int)(h*0.8), (int) (l*0.01), (int) (h*0.2));

        // mesas
        

        // caixas













        return (buffer);

    }

}
