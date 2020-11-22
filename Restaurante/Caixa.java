public class Caixa extends Funcionario{

    private boolean isOcupado;
    private int numCaixa;
    public Caixa(int numCaixa)
    {
        this.numCaixa = numCaixa;
    }

    @Override
    public boolean isOcupado() {
       
        return this.isOcupado;
    }

    @Override
    public void setOcupado(boolean ocupado) {
        this.isOcupado = ocupado;
    }
    
    public void confirmaPagamento(Cliente cliente)
    {
        if(!cliente.verificarPagamento()){
            cliente.setContaPaga();   
        }
    }
} 
