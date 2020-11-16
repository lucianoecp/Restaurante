public class Cliente {
    private String nome;
    private int numPedido;
    private boolean inRestaurante;
    public Cliente(String nome,int numPedido)
    {   
        this.nome = nome;
        this.numPedido = numPedido;
    }
	public String getNome()
    {
        return this.nome;
    }
    public int realizaPedido()
    {
        return; 
    }
}
