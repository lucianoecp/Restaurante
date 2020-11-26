import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

public class Salao
{
    private static int l, h;
    private static Mesa m1, m2, m3, m4;
    private static Caixa cx1, cx2;

    Salao(int largura, int altura)
    {
        this.l = largura;
        this.h = altura;

        m1 = new Mesa((int)((largura/4)*1), (int)((altura/4)*1.5));
        m2 = new Mesa((int)((largura/4)*2), (int)((altura/4)*1.5));
        m3 = new Mesa((int)((largura/4)*1), (int)((altura/4)*3));
        m4 = new Mesa((int)((largura/4)*2), (int)((altura/4)*3));

        cx1 = new Caixa(largura-30,40);
        cx2 = new Caixa(largura-30,120);

    }

    public static BufferedImage criarImagem()
    {
        BufferedImage buffer = new BufferedImage(l, h,
                BufferedImage.TYPE_INT_RGB);

        Graphics g = buffer.createGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0,0, l, h);
        g.setColor(Color.CYAN);
        g.fillRect(l/10,h/10,(int) (l*0.90),(int) (h*0.90));

        // entrada
        g.setColor(Color.RED);
        g.fillRect(l/10, h/10, (int) (l*0.01), (int) (h*0.2));

        // saida
        g.setColor(Color.RED);
        g.fillRect((int)(l-7), (int)(h*0.80), (int) (l*0.01), (int) (h*0.2));

        // mesas
        m1.render(g);
        m2.render(g);
        m3.render(g);
        m4.render(g);

        // caixas
        cx1.render(g);
        cx2.render(g);







        





        return (buffer);

    }

}
