public class Cliente {

    private String nome;
    private Conta conta = new Conta();

    public Cliente(String nome)
    {   
        this.nome = nome;
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
    public boolean isPago()
    {
        return this.conta.isPago();
    }

}
