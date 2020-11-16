public class Mesa {
    private boolean isFree;
    private Cliente cliente;
    public Mesa(){
        this.isFree = true;
    }
    public boolean checkMesa(){
        return this.isFree;
    }
    public void ocupaMesa(Cliente cliente)
    {   
        this.cliente = cliente;
        this.isFree = false;
    }
    public void liberaMesa(){
        this.cliente = null;
        this.isFree = true;
    }

}
