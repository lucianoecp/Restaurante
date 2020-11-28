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
    public void entraNaFila(Cliente cliente)
    {
        fila.entraNaFila(cliente);
    }

    @Override
    public Cliente saiDaFila()
    {
        return fila.saiDaFila();
    }

    @Override
    public boolean isVazia()
    {
        return fila.isVazia();
    }
} 