public class Cliente extends Pessoa{

    private Conta conta = new Conta();

    public Cliente(int numCliente,String nomeCliente)
    {   super(numCliente,nomeCliente);
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
