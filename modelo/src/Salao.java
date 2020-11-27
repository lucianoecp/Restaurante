import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.security.DrbgParameters.Reseed;


public class Salao
{
    OpenRestaurante restaurante = new OpenRestaurante();
    private static final int LARGURA = 160;
    private static final int ALTURA = 95;
    private static int ESCALA = 5;
    private static int FRAMES = 30;

    private static int l, h;

    Salao(int largura, int altura)
    {
        this.l = largura;
        this.h = altura;

    }

    public void getMesas(){

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
        restaurante.modelaMesa(LARGURA*2, ALTURA*1.5, g);
        restaurante.modelaMesa(LARGURA*2, ALTURA*3, g);
        restaurante.modelaMesa(LARGURA*3, ALTURA*1.5, g);
        restaurante.modelaMesa(LARGURA*3, ALTURA*3, g);

        // caixas 
        restaurante.modelaCaixa(LARGURA*ESCALA-40, 0, g);
        restaurante.modelaCaixa(LARGURA*ESCALA-40, 90, g);

        return (buffer);

    }

}
