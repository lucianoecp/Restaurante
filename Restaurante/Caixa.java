public class Caixa extends Pessoa implements Enfileiramento{

    private Fila fila = new Fila();

    public Caixa(int numCaixa)
    {
        super(numCaixa);
    }

    public void confirmaPagamento(Cliente cliente)
    {
        if(!cliente.isPago()){
            System.out.println("O Caixa" + this.getNomePessoa() + " recebeu o pagamento do " + cliente.getNomePessoa());
            cliente.setPagamento();   
        }
    }

    @Override
    public void entrarNaFila(Cliente cliente)
    {
        fila.entrarNaFila(cliente);
    }

    @Override
    public Cliente sairDaFila()
    {
        return fila.sairDaFila();
    }

    @Override
    public boolean isVazio()
    {
        return fila.isVazio();
    }
} 