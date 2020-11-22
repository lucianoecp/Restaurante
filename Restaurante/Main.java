import java.util.*;  

public class Main{
    public static void main(String[] args){
        \\"Usando somente para testes, ignorar o que tem aqui"
        ArrayList<Mesa> mesas = new ArrayList<Mesa>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Garcom> garcons = new ArrayList<Garcom>();

        Fila fila = new Fila();
        Cozinheiro cozinheiro = new Cozinheiro();
        Auxiliar auxiliar = new Auxiliar();

        Cliente cliente = new Cliente("João");
        Cliente cliente2 = new Cliente("fARINHA");
        Mesa mesa = new Mesa();
        
        mesa.ocupaMesa(cliente2);

        System.out.println(cliente.equals(mesa.clienteInMesa()));

        Pedido pedido = new Pedido();
        
        
    }
}
