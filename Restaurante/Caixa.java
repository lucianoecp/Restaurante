public class Caixa extends Funcionario{

    
    public Caixa(int numCaixa)
    {
        super(numCaixa);
    }
    public void confirmaPagamento(Cliente cliente)
    {
        if(!cliente.isPago()){
            cliente.setContaPaga();   
        }
    }
} 
