public interface Enfileiramento
{
    public void entrarNaFila(Cliente cliente);
    public abstract Cliente sairDaFila();
    public abstract boolean isVazio();
}
