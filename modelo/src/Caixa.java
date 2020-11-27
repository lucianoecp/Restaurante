import java.awt.*;

public class Caixa extends Pessoa
{
    private Fila fila = new Fila();

    private double px, py;
    private final int tamanho = 80;

    public Caixa(int numCaixa)
    {
        super(numCaixa);
    }

    public void confirmaPagamento(Cliente cliente)
    {
        if(!cliente.isPago()){
            System.out.println("O Caixa" + this.getNomePessoa() + " recebeu o pagamento do " + cliente.getNomePessoa());
            cliente.setContaPaga();   
        }
    }

    public void entrarNaFila(Cliente cliente)
    {
        fila.entraNaFila(cliente);
    }

    public Cliente sairDaFila()
    {
        return fila.saiDaFila();
    }

    public boolean isVazio()
    {
        return fila.isVazia();
    }


    public void setCaixa(double px, double py){
        this.px = px;
        this.py = py;
    }

    public void render (Graphics g)
    {
        g.setColor(Color.GREEN);
        g.fillRect((int)px, (int)py, tamanho/2, tamanho);
        g.setColor(Color.BLACK);
        g.drawRect((int)px, (int)py, tamanho/2, tamanho);
    }
} 