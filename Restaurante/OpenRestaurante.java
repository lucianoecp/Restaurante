import java.util.*;  
public class OpenRestaurante{
    
    private ArrayList<Mesa> mesas = new ArrayList<Mesa>();
    private ArrayList<Garcom> garcons = new ArrayList<Garcom>();
    private ArrayList<Caixa> caixas = new ArrayList<Caixa>();
 
    Fila fila = new Fila();

    private int numCliente = 0;
    private String nomeCliente;

    private Cliente makeCliente(){
        nomeCliente = "Cliente" + numCliente++;
        System.out.println(nomeCliente + " Entrou no Restaurante");
        return new Cliente(nomeCliente);
    }
    public void chegaRestaurante(){
        fila.entraNaFila(makeCliente());
    }
    public void checarMesaLivre(){
        for (Mesa mesa:mesas)
        {
            if (mesa.checkMesa())
            {   
                mesa.toString();               
                mesa.ocupaMesa(fila.saiDaFila());
                System.out.println("Mesa Foi Ocupada");
                return;
            }
        }
        
        System.out.println("Não Há Mesas Livres, Esperando Na Fila"); 
    } 
    
    public void atenderMesa(){
        for(Garcom garcom:garcons)
        {
            if(!garcom.isOcupado()){
                for(Mesa mesa: mesas)
                {
                    if(!mesa.isAtendido())
                    {
                        garcom.atenderMesa(mesa);
                    }
                }
            }
        }
    }
    public Cliente checarMesaAtendida(){
        for (Mesa mesa:mesas)
        {
            if (mesa.isAtendido())
            {                 
                System.out.println("Mesa Foi Atendida,Cliente se dirigindo ao Caixa");
                return mesa.clienteInMesa();
            }
        }
        return null;
    } 
    
    public void pagaConta(Cliente cliente)
    {
        for(Caixa caixa:caixas)
        {
            if(!caixa.isOcupado())
            {
                caixa.confirmaPagamento(cliente);
                for(Mesa mesa:mesas){
                    if(cliente.equals(mesa.clienteInMesa())){
                        mesa.liberaMesa();
                    }
                }
            }
        }
    }
    public void checkFila(){
        fila.inFila();
    }

}