import java.io.IOException;
import java.util.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main extends Thread {
    private static OpenRestaurante restaurante = new OpenRestaurante();
    private static Random gerador = new Random();

    public static void main(String[] args) throws InterruptedException, IOException {
        restaurante.makeMesa();
        restaurante.makeMesa();
        restaurante.makeMesa();
        restaurante.makeMesa();

        restaurante.makeCaixa();
        restaurante.makeCaixa();

        restaurante.makeGarcom();
        restaurante.makeGarcom();

        
        while (true) {
            int randomNum = ThreadLocalRandom.current().nextInt(1000,5000 + 1);

            new Thread(chegaRestaurante).start();
            Thread.sleep(3000);
            new Thread(checkMesa).start();
            new Thread(atenderMesa).start();
            new Thread(pagamentoConta).start();
            
        }
    }

    private static Runnable chegaRestaurante = new Runnable() {
        public void run() {
            restaurante.chegaRestaurante();
            restaurante.checkFila();   
    }  
};
    private static Runnable checkMesa = new Runnable(){
        public void run(){
            restaurante.checarMesaLivre();
    }

};  private static Runnable atenderMesa = new Runnable(){
        public void run(){
            restaurante.atenderMesaTest();
    }
};
    private static Runnable pagamentoConta = new Runnable(){
        public void run(){
                restaurante.checarMesaAtendidaTest();
        }
    };

}