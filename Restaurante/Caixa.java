public class Caixa {
    private float saida;
    private float comissao;
    private String pagamento;
    private float total; // dinheiro total no caixa

    void setPagamento(String pag){
        this.pagamento = pag;
    }
    void setTotal(float x){
        this.total += x;
    }
    void setSaida(float x){
        this.total -= x;
        this.saida += x;
    }
}
