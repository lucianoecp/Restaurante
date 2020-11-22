import java.util.*;  

public class Main extends Thread{

    private static Runnable chegaCliente = new Runnable() {
        public void run() {
            clientes.add(auxiliar.makeCliente());
            Thread.sleep(20);
        }
    };
    public static Mesa checarMesa(ArrayList<Mesa> mesas){
        for (Mesa mesa:mesas)
        {
            if (mesa.checkMesa())
            {
                System.out.println("Há uma mesa Livre");
                return mesa;
            }
        }
        return null;
    }

    public static void main(String[] args){
        ArrayList<Mesa> mesas = new ArrayList<Mesa>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Garcom> garcons = new ArrayList<Garcom>();

        Fila fila = new Fila();
        Cozinha ca = new Cozinha();
        Cozinheiro cozinheiro = new Cozinheiro();
        Auxiliar auxiliar = new Auxiliar();

        new Thread(chegaCliente).start();
        
        mesas.add(new Mesa());
        

        System.out.println(auxiliar.makeCliente());
        System.out.println(checarMesa(mesas) instanceof Mesa);
        

        Pedido pedido = new Pedido();
        
        
        Cliente cliente = new Cliente("Joana",pedido.realizaPedido());
        Cliente cliente2 = new Cliente("João",pedido.realizaPedido());
    }
}
