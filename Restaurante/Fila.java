import java.util.ArrayList;

public class Fila {
    private ArrayList<Cliente> inFila = new ArrayList<Cliente>();
    public Fila()
    {
    }
    public void entraNaFila(Cliente cliente)
    {
        this.inFila.add(cliente);
    }
    public Cliente saiDaFila()
    {
       return this.inFila.remove(0);
    }
    public boolean isVazia()
    {
        return this.inFila.isEmpty();
    }
    public void inFila()
    {
        for(Cliente cliente: this.inFila){
            System.out.println("Cliente em Fila: " + cliente.getNome());
        }
    }
}
