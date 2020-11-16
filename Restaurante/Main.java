import java.util.*;  

public class Main {
    public static Cliente checaFila(Fila fila){
        return null;

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
