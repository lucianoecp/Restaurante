import java.util.*;  
import java.util.Random; 
public class OpenRestaurante{
    
    private List<Mesa> mesas = new ArrayList<Mesa>();
    private List<Garcom> garcons = new ArrayList<Garcom>();
    private List<Caixa> caixas = new ArrayList<Caixa>();
    
    private Fila fila = new Fila();

    private int[] ids = {1,1,1,1};

    private Random rand = new Random(); 
    private Cliente makeCliente()
    {
        System.out.println("Cliente" + ids[0] + " Entrou no Restaurante");
        return new Cliente(ids[0]++,"Cliente");
    }
    public void makeMesa(int num){
            for(int i = 0;i<num;i++)
                mesas.add(new Mesa(ids[1]++));
    }
    public void makeCaixa(int num){
        for(int i = 0;i<num;i++)
            caixas.add(new Caixa(ids[2]++));
    }
    public void makeGarcom(int num){
        for(int i = 0;i<num;i++)
            garcons.add(new Garcom(ids[3]++));
    }
    public void chegaRestaurante(){
        fila.entraNaFila(makeCliente());
    }
    public void checarMesaLivre()
    {
        for (Mesa mesa:mesas)
        {   
            if (!fila.isVazia() & mesa.checkMesa())
            {   
                mesa.toString();               
                mesa.ocupaMesa(fila.saiDaFila());
            }
        } 
    } 
    public void atenderMesaTest(){
        Garcom garcom = garcons.get(rand.nextInt(garcons.size()));
        if(garcom.isOcupado()){garcom.setOcupado(false);}
        else{
            for(Mesa mesa: mesas)   
            if(!mesa.checkMesa() & (!garcom.isOcupado() & !mesa.isAtendido()))
            {   
                garcom.atenderMesa(mesa);
                garcom.setOcupado(true);
            }
        } 
    }
    private void pagaContaTest(Cliente cliente)
    {
        Caixa caixa = caixas.get(rand.nextInt(caixas.size()));  
        if(caixa.isOcupado()){caixa.setOcupado(false);}
        else{   
            for(Mesa mesa: mesas){
                caixa.confirmaPagamento(cliente);
                if(cliente.equals(mesa.clienteInMesa())){
                    mesa.liberaMesa();
                    caixa.setOcupado(true);
                }
          }
        } 
    }
    public void checarMesaAtendidaTest(){
        Mesa mesa = mesas.get(rand.nextInt(mesas.size()));
        if (mesa.isAtendido())
        {                 
            System.out.println("\nMesa" + mesa.getNumMesa() + " Atendida, " + mesa.clienteInMesa().getNomePessoa() + " se dirigindo ao Caixa");
            pagaContaTest(mesa.clienteInMesa());
        }
    } 
    public void checkFila(){
        fila.inFila();
    }
}