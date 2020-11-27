import java.util.*;  
import java.util.Random; 
import java.awt.Graphics;


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

    private Mesa mesa = new Mesa(numMesa);
    private Caixa caixa = new Caixa(numCaixa);
    private Garcom garcom = new Garcom(numGarcom);
    private Cliente cliente = new Cliente(numCliente, "");
    
    Random rand = new Random();


    private Cliente makeCliente()
    {
        System.out.println("Cliente" + numCliente + " Entrou no Restaurante");
        return new Cliente(numCliente++, "Cliente");
    }

    public void modelaCliente(double px, double py, Graphics g){
        cliente.setCliente(px, py);
        cliente.render(g);
    }

    //edit: luciano, (em teste)
    public void moveCliente(int px, int py, Graphics g)
    {
        cliente.moveToPosition(px, py);
        cliente.render(g);
    }

    public void makeMesa()
    { 
        mesas.add(new Mesa(numMesa++));
    }

    public void modelaMesa(double px, double py, Graphics g)
    {
        mesa.setMesa(px, py);
        mesa.render(g);
    }

    public void makeCaixa()
    {
        caixas.add(new Caixa(numCaixa++));
    }

    public void modelaCaixa(double px, double py, Graphics g)
    {
        caixa.setCaixa(px, py);
        caixa.render(g);
    }

    public void makeGarcom()
    {
        garcons.add(new Garcom(numGarcom++));
    }

    public void modelaGarcom(double px, double py, Graphics g){
        garcom.setGarcom(px, py);
        garcom.render(g);
    }

    public void chegaRestaurante()
    {
        randomNum = rand.nextInt(3); 
        for(int i = 0; i < randomNum; i++) {
        fila.entraNaFila(makeCliente());
        }
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
            }
            garcom.setOcupado(false);
        }
    }

    public Cliente checarMesaAtendida(){
        for (Mesa mesa:mesas)
        {
            if (mesa.isAtendido())
            {
                //edit:luciano
                System.out.println("Mesa" + mesa.getNumMesa() + " Atendida, o Cliente "+ mesa.clienteInMesa().getIdPessoa() +" se dirigindo ao Caixa \n");
                pagaConta(mesa.clienteInMesa());
            }
        }
        return null;
    } 
    
    private void pagaConta(Cliente cliente)
    {
        for(int i = 0; i< caixas.size();i++)
        {   
            Caixa caixa = caixas.get(rand.nextInt(caixas.size()));
            for(Mesa mesa:mesas){
                caixa.entrarNaFila(cliente);
                if(!caixa.isOcupado()){
                    caixa.confirmaPagamento(cliente);
                    if(cliente.equals(mesa.clienteInMesa())){
                        mesa.liberaMesa();
                        caixa.setOcupado(true);
                        caixa.sairDaFila();
                    }
                }else if(!cliente.isPago() & caixa.isOcupado()){
                    System.out.println(cliente.getNomePessoa() + " Esperando para pagar");
                }
            }
            caixa.setOcupado(false);
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
                caixa.entrarNaFila(cliente);
                if(!caixa.isOcupado()){
                    caixa.confirmaPagamento(cliente);
                    if(cliente.equals(mesa.clienteInMesa())){
                        mesa.liberaMesa();
                        caixa.setOcupado(true);
                        caixa.sairDaFila();
                    }
                }else if(!cliente.isPago() & caixa.isOcupado()){
                    System.out.println(cliente.getNomePessoa() + " Esperando para pagar");
                } 
            }
            caixa.setOcupado(false);
        }
    }

    public Cliente checarMesaAtendidaTest()
    {
        for(int i = 0; i< mesas.size();i++)
        {   Mesa mesa = mesas.get(rand.nextInt(mesas.size()));
            if (mesa.isAtendido())
            {
                //edit:luciano
                System.out.println("\nMesa" + mesa.getNumMesa() + " Atendida, o Cliente "+ mesa.clienteInMesa().getIdPessoa() +" se dirigiu ao Caixa");
                pagaContaTest(mesa.clienteInMesa());
            }
        }
        return null;
    }



}