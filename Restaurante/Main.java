import java.util.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static OpenRestaurante restaurante = new OpenRestaurante();
    private static Random gerador = new Random();

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            //int randomNum = ThreadLocalRandom.current().nextInt(1000,5000 + 1);
            new Thread(chegaRestaurante).start();
            Thread.sleep(1000);
            new Thread(checkMesa).start();
            Thread.sleep(1000);
            new Thread(atenderMesa).start();
            Thread.sleep(1000);
            new Thread(pagamentoConta).start();
            Thread.sleep(1000);
            
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
            if(restaurante.checarMesaAtendida() instanceof Object)    
                restaurante.pagaConta(restaurante.checarMesaAtendida());
       
    }
};
    private static Runnable pagamentoConta = new Runnable(){
        public void run(){
            if(restaurante.checarMesaAtendida() instanceof Object)    
                restaurante.pagaConta(restaurante.checarMesaAtendida());
           
        }
    };
    

}