import java.util.*;  

public class Main extends Thread{
    public static void main(String[] args) throws InterruptedException {
        OpenRestaurante restaurante = new OpenRestaurante();
        while(true){
        new Thread(){
            public void run() {
            restaurante.chegaRestaurante();
            
        }
        
    }.start();
    Thread.sleep(1000);
}
    }
}
