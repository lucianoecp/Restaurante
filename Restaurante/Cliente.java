public class Cliente extends Pessoa implements Pagamento {

    private Conta conta = new Conta();

    public Cliente(int numCliente,String nomeCliente)
    {   
        super(numCliente,nomeCliente);
    }
    public String realizaPedido(String nomePedido)
    {
        return nomePedido; 
    }

    @Override
    public void setPagamento()
    {
        this.conta.setPagamento();
    }

    @Override
    public boolean isPago()
    {
        return this.conta.isPago();
    }

}
