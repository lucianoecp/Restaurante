public class Caixa{

    private float saida;
    private float comissao;
    private float total; // dinheiro total no caixa
    private Conta conta;

    public Caixa(Conta conta){
        this.conta = conta;
    }

    void setTotal(float x){
        this.total += x;
    }
    void setSaida(float x){
        this.total -= x;
        this.saida += x;
    }
    float getTotal(){
        return this.total;
    }
    float getSaida(){
        return this.saida;
    }

} 
