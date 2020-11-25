public class Caixa extends Pessoa{

    private Fila fila = new Fila();
    public Caixa(int numCaixa)
    {
        super(numCaixa);
    }
    public void confirmaPagamento(Cliente cliente)
    {
        if(!cliente.isPago()){
            System.out.println("O Caixa " + this.getNomePessoa() + "recebeu o pagamento do " + cliente.getNomePessoa());
            cliente.setContaPaga();   
        }
    }
} 
