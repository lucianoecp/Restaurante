public class Pedido{
    private int qtdPedidos;
    public Pedido()
    {
    }
    public int realizaPedido()
    {
        return this.qtdPedidos++;
    }
}