import java.io.IOException;
import java.util.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main extends Thread {
    private static OpenRestaurante restaurante = new OpenRestaurante();
    private static Random gerador = new Random();

    private static void clearScreen(){
        char esc = 27;
        String clear = esc + "[2J"; // codigo para limpar a tela
        System.out.println(clear);
    }

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
            clearScreen();
            new Thread(chegaRestaurante).start();
            new Thread(checkMesa).start();
            new Thread(atenderMesa).start();
            new Thread(pagamentoConta).start();
            Thread.sleep(4000);
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