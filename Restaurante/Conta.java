public class Conta implements Pagamento{
    private boolean isPaga;
    
    @Override
    public boolean isPago(){
        return this.isPaga;
    }

    @Override
    public void setPagamento(){
        this.isPaga = true;
    }
}
