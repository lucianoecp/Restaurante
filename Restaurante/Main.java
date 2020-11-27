import java.io.IOException;
public class Main extends Thread {
    private static OpenRestaurante restaurante = new OpenRestaurante();
    public static void main(String[] args) throws InterruptedException, IOException {
        restaurante.makeMesa(4);
        restaurante.makeCaixa(4);
        restaurante.makeGarcom(4);
        while (true) {
            new Thread(chegaRestaurante).start();
            new Thread(checkMesa).start();
            new Thread(atenderMesa).start();
            new Thread(pagamentoConta).start();
            restaurante.checkFila();
            Thread.sleep(4000);
        }
    }
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
