public class Caixa extends Funcionario{

    private boolean isOcupado;
    private int numCaixa;
    public Caixa(int numCaixa)
    {
        this.numCaixa = numCaixa;
    }
    
    public void confirmaPagamento(Cliente cliente)
    {
        if(!cliente.isPago()){
            cliente.setContaPaga();   
        }
    }
} 
