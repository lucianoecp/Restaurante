import javax.swing.*;
import java.awt.*;
import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.awt.image.BufferStrategy;
import java.lang.ref.PhantomReference;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App extends Canvas implements Runnable
{
    private static final int LARGURA = 160;
    private static final int ALTURA = 95;
    private static int ESCALA = 5;

    private static double contador;

    private static int FRAMES = 30;

    private static Salao salao;

    private static OpenRestaurante restaurante;
    private static Random gerador;



    public App()
    {
        this.setPreferredSize(
                new Dimension(LARGURA*ESCALA, ALTURA*ESCALA));

        salao = new Salao(LARGURA*ESCALA, ALTURA*ESCALA);

        restaurante = new OpenRestaurante();
        gerador = new Random();

    }

    public static void main(String[] args) throws Exception
    {
        App app = new App();

        JFrame frame = new JFrame("Teste");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(app);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        restaurante.makeMesa();
        restaurante.makeMesa();

        restaurante.makeCaixa();
        restaurante.makeCaixa();

        restaurante.makeGarcom();
        restaurante.makeGarcom();

        new Thread(app).start();
    }

    public void tick()
    {
        //System.out.println("tick");
        if(contador >= 60)
        {
            new Thread(chegaRestaurante).start();
            new Thread(checkMesa).start();
            new Thread(atenderMesa).start();
            new Thread(pagamentoConta).start();
            contador = 0;
        }

        contador++;


    }

    public void render()
    {
        
        //System.out.println("render");

        BufferStrategy bs = this.getBufferStrategy();

        if(bs == null)
        {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = salao.criarImagem().getGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, LARGURA*ESCALA, ALTURA*ESCALA);

        g = bs.getDrawGraphics();
        g.drawImage(salao.criarImagem(), 0,0, LARGURA*ESCALA, ALTURA*ESCALA, null);

        // Elementos estáticos:
        restaurante.modelaMesa(LARGURA*2, ALTURA*1.5, g);
        restaurante.modelaMesa(LARGURA*2, ALTURA*3, g);
        restaurante.modelaMesa(LARGURA*3, ALTURA*1.5, g);
        restaurante.modelaMesa(LARGURA*3, ALTURA*3, g);

        restaurante.modelaCaixa(LARGURA*ESCALA-40, 0, g);
        restaurante.modelaCaixa(LARGURA*ESCALA-40, 90, g);

        restaurante.modelaGarcom(150, 180, g);

        restaurante.modelaCliente(LARGURA*ESCALA-40, ALTURA*4.3, g);

        bs.show();

        
    }
    
    private static void clearScreen()
    {
        char esc = 27;
        String clear = esc + "[2J"; // codigo para limpar a tela
        System.out.println(clear);
    }

    private static Runnable chegaRestaurante = new Runnable()
    {
        public void run() {
            restaurante.chegaRestaurante();
            restaurante.checkFila();
        }
    };
    private static Runnable checkMesa = new Runnable()
    {
        public void run(){
            restaurante.checarMesaLivre();
        }

    };
    private static Runnable atenderMesa = new Runnable()
    {
        public void run(){
            restaurante.atenderMesaTest();
        }
    };
    private static Runnable pagamentoConta = new Runnable()
    {
        public void run(){
            restaurante.checarMesaAtendidaTest();
        }
    };

    @Override
    public void run()
    {
        while (true)
        {
            tick();
            render();

            try
            {
                Thread.sleep(1000/FRAMES);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    };
}
