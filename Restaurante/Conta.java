public class Conta{
    private boolean isPaga;
    private double valor;

    public void setValor(float valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    public boolean isPago(){
        return this.isPaga;
    }
    public void setPagamento(){
        this.isPaga = true;
    }


}
