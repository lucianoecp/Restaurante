
import java.awt.*;
import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.awt.image.BufferStrategy;

import javax.swing.*;


public class App extends Canvas implements Runnable
{
    private static final int LARGURA = 160;
    private static final int ALTURA = 95;
    private static int ESCALA = 4; // (640x380)

    private static int fps = 60;
    private final Salao salao;
    private Cliente cl;
    private Garcom gc;

    // Criar um layer, onde vai ser renderizado os objetos:
    //private final BufferedImage layer = new BufferedImage(LARGURA*ESCALA, ALTURA*ESCALA, BufferedImage.TYPE_INT_RGB);


    public App()
    {
        this.setPreferredSize(new Dimension(LARGURA*ESCALA, ALTURA*ESCALA));

        cl = new Cliente();
        salao = new  Salao(LARGURA*ESCALA, ALTURA*ESCALA);
        gc = new Garcom(440,240);

    }

    public static void main(String[] args) throws Exception {

        App app = new App();

        JFrame frame = new JFrame("Teste");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(app);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        new Thread(app).start();
    }

    public void tick()
    {
        //System.out.println(cl.getCirc().getPx()+"/"+cl.getCirc().getPy());
        //cl.movimento();
        cl.moveToPosition(150,150);

    }

    public void render()
    {
        System.out.println("render");

        BufferStrategy bs = this.getBufferStrategy();

        if(bs == null)
        {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = salao.criarImagem().getGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, LARGURA*ESCALA, ALTURA*ESCALA);

        //cl.render(g);

        g = bs.getDrawGraphics();
        g.drawImage(salao.criarImagem(), 0,0, LARGURA*ESCALA, ALTURA*ESCALA, null);

        cl.render(g);
        gc.render(g);


        bs.show();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            tick();
            render();

            try
            {
                Thread.sleep(1000/fps);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    };
}
