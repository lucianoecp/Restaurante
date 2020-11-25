import java.util.*;  
import java.util.Random; 
public class OpenRestaurante{
    
    private List<Mesa> mesas = new ArrayList<Mesa>();
    private List<Garcom> garcons = new ArrayList<Garcom>();
    private List<Caixa> caixas = new ArrayList<Caixa>();
    
    private Fila fila = new Fila();

    private int numCliente = 0;
    private int numMesa = 0;
    private int numCaixa = 0;
    private int numGarcom = 0;
    private int randomNum;
    
    Random rand = new Random(); 
    private Cliente makeCliente(){
        System.out.println("Cliente" + numCliente++ + " Entrou no Restaurante");
        return new Cliente(numCliente,"Cliente");
    }
    public void makeMesa(){
        mesas.add(new Mesa(numMesa++));
    }
    public void makeCaixa(){
        caixas.add(new Caixa(numCaixa++));
    }
    public void makeGarcom(){
        garcons.add(new Garcom(numGarcom++));
    }

    public void chegaRestaurante(){
        randomNum = rand.nextInt(3); 
        for(int i = 0; i < randomNum; i++) {
        fila.entraNaFila(makeCliente());
        }
    }
    public void checarMesaLivre(){
        for (Mesa mesa:mesas)
        {   
            if (!fila.isVazia() & mesa.checkMesa())
            {   
                mesa.toString();               
                mesa.ocupaMesa(fila.saiDaFila());
                
            }
        } 
    } 
    
    public void atenderMesa(){
        for(Garcom garcom:garcons)
        {
                for(Mesa mesa: mesas)
                {
                    if(!mesa.checkMesa() & (!garcom.isOcupado() & !mesa.isAtendido()))
                    {
                        garcom.atenderMesa(mesa);
                        garcom.setOcupado(true);
                    }
                }garcom.setOcupado(false);
            }
        }

    public Cliente checarMesaAtendida(){
        for (Mesa mesa:mesas)
        {
            if (mesa.isAtendido())
            {                 
                System.out.println("Mesa" + mesa.getNumMesa() + " Atendida,Cliente se dirigindo ao Caixa \n");
                pagaConta(mesa.clienteInMesa());
            }
        }
        return null;
    } 
    
    public void pagaConta(Cliente cliente)
    {
        for(Caixa caixa:caixas)
        {   
            for(Mesa mesa:mesas){
                if(!caixa.isOcupado())
                 {
                    caixa.confirmaPagamento(cliente);
                    if(cliente.equals(mesa.clienteInMesa())){
                        mesa.liberaMesa();
                        caixa.setOcupado(true);
                    }
                }
            }caixa.setOcupado(false);
        }
    }

    public void checkFila(){
        fila.inFila();
    }


    //Funcoes que pegam elementos aleatorios
    public void atenderMesaTest(){
        for(int i = 0; i< garcons.size();i++){
               Garcom garcom = garcons.get(rand.nextInt(garcons.size()));
                for(int j = 0; j< mesas.size();j++){

                   Mesa mesa = mesas.get(rand.nextInt(mesas.size()));

                    if(!mesa.checkMesa() & (!garcom.isOcupado() & !mesa.isAtendido()))
                    {   
                        garcom.atenderMesa(mesa);
                        garcom.setOcupado(true);
                    }
        } garcom.setOcupado(false);
    }
    }
    private void pagaContaTest(Cliente cliente)
    {
        for(int i = 0; i< caixas.size();i++)
        {   
            Caixa caixa = caixas.get(rand.nextInt(caixas.size()));
            for(Mesa mesa:mesas){
                if(!caixa.isOcupado()){
                    caixa.confirmaPagamento(cliente);
                    if(cliente.equals(mesa.clienteInMesa())){
                        mesa.liberaMesa();
                        caixa.setOcupado(true);
                    }
                }else if(!caixa.isVazio() & caixa.isOcupado()){
                    caixa.entrarNaFila(cliente);
                }
            }caixa.setOcupado(false);
        }
    }
    public Cliente checarMesaAtendidaTest(){
        for(int i = 0; i< mesas.size();i++)
        {   Mesa mesa = mesas.get(rand.nextInt(mesas.size()));
            if (mesa.isAtendido())
            {                 
                System.out.println("\nMesa" + mesa.getNumMesa() + " Atendida,Cliente se dirigindo ao Caixa");
                pagaContaTest(mesa.clienteInMesa());
            }
        }
        return null;
    } 
}