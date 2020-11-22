public class Cliente {

    private String nome;
    private Conta conta = new Conta();

    public Cliente(String nome,int numPedido)
    {   
        this.nome = nome;
        this.numPedido = numPedido;
    }
	public String getNome()
    {
        return this.nome;
    }
    public String realizaPedido(String nomePedido)
    {
        return nomePedido; 
    }
    public void setContaPaga()
    {
        this.conta.setPagamento();
    }
    public boolean verificarPagamento()
    {
        return this.conta.verificaPagamento();
    }

}
