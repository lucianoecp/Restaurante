import java.util.ArrayList;

public class Fila implements Enfileiramento {
    private ArrayList<Cliente> inFila = new ArrayList<Cliente>();
    public Fila()
    {
    }

    @Override
    public void entraNaFila(Cliente cliente)
    {
        this.inFila.add(cliente);
    }

    @Override
    public Cliente saiDaFila()
    {
       return this.inFila.remove(0);
    }

    @Override
    public boolean isVazia()
    {
        return this.inFila.isEmpty();
    }

    public void inFila()
    {   
        if(!isVazia()){
            try{
                for(Cliente cliente:this.inFila){
                    System.out.println("Cliente em Fila: " + cliente.getNomePessoa());
                }
            }catch(Exception e){}
        }
    }
}
