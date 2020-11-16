import java.util.ArrayList;

public class Fila {
    private ArrayList<Cliente> inFila = new ArrayList<Cliente>();
    public Fila()
    {
    }
    public void increaseFila(Cliente cliente)
    {
        this.inFila.add(cliente);
    }
    public void popFila()
    {
        this.inFila.remove(0);
    }
    public void inFila()
    {
        for(Cliente cliente: this.inFila);{
            System.out.println("Cliente em Fila: " + cliente.getNome());
        }
    }
}
