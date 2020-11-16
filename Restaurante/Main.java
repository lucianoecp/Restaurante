import java.util.*;  

public class Main {
    private static Runnable chegaCliente = new Runnable() {
        public void run() {
            try{
                clientes.add(new Cliente())
                Thread.sleep(2000);
                }
            } catch (Exception e){}
        }
    public static Mesa checarMesa(ArrayList<Mesa> mesas){
        for (Mesa mesa:mesas)
        {
            if (mesa.checkMesa())
            {
                System.out.println("Há uma mesa Livre");
                mesa.ocupaMesa();
                return mesa;
            }
        }
        return null;
    }
    public static  void main(String[] args){
        ArrayList<Mesa> mesas = new ArrayList<Mesa>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Garcom garcom = new Garcom();
        Fila fila = new Fila();
        Cozinha cozinha = new Cozinha();
        Cozinheiro cozinheiro = new Cozinheiro();
        Auxiliar auxiliar = new Auxiliar();


        mesas.add(new Mesa());
        

        System.out.println(auxiliar.makeCliente());
        System.out.println(checarMesa(mesas) instanceof Mesa);
        

        Pedido pedido = new Pedido();
        
        
        Cliente cliente = new Cliente("Joana",pedido.realizaPedido());
        Cliente cliente2 = new Cliente("João",pedido.realizaPedido());
    }
}
