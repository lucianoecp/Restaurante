import java.io.IOException;
<<<<<<< Updated upstream
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
=======
>>>>>>> Stashed changes

public class Main extends Thread {
    private static OpenRestaurante restaurante = new OpenRestaurante();

<<<<<<< Updated upstream
    private static void clearScreen()
    {
        char esc = 27;
        String clear = esc + "[2J"; // codigo para limpar a tela
        System.out.println(clear);
    }

    public static void main(String[] args) throws InterruptedException, IOException 
    {
        restaurante.makeMesa();
        restaurante.makeMesa();
        restaurante.makeMesa();
        restaurante.makeMesa();

        restaurante.makeCaixa();
        restaurante.makeCaixa();

        restaurante.makeGarcom();
        restaurante.makeGarcom();

        
        while (true) 
        {
            int randomNum = ThreadLocalRandom.current().nextInt(1000,5000 + 1);
            //clearScreen(); // para limpar a tela
=======
    public static void main(String[] args) throws InterruptedException, IOException {
        restaurante.makeMesa(4);
        restaurante.makeCaixa(4);
        restaurante.makeGarcom(4);

        while (true) {
>>>>>>> Stashed changes
            new Thread(chegaRestaurante).start();
            new Thread(checkMesa).start();
            new Thread(atenderMesa).start();
            new Thread(pagamentoConta).start();
            Thread.sleep(4000);
        }
    }
<<<<<<< Updated upstream

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

}
=======
    private static Runnable chegaRestaurante = new Runnable() {
        public void run() {restaurante.chegaRestaurante();}  
    };
    private static Runnable checkMesa = new Runnable(){
        public void run(){restaurante.checarMesaLivre();}
    };  
    private static Runnable atenderMesa = new Runnable(){
        public void run(){restaurante.atenderMesaTest();}
    };
    private static Runnable pagamentoConta = new Runnable(){
        public void run(){restaurante.checarMesaAtendidaTest();}
    };
}
>>>>>>> Stashed changes
