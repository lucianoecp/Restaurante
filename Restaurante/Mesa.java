public class Mesa {
    private boolean isFree;
    private boolean isAtendido;
    private Cliente cliente;
    private int numMesa;
    public Mesa(int numMesa){
        this.numMesa = numMesa;
        this.isFree=true;
    }
    public int getNumMesa()
    {
        return this.numMesa;
    }
    public boolean checkMesa(){
        return this.isFree;
    }

    public void ocupaMesa(Cliente cliente)
    {   
        this.cliente = cliente;
        System.out.println("\nO Cliente " + this.cliente.getNome() + " Ocupou a Mesa " + this.numMesa + "");
        this.isFree = false;
    }
    public void liberaMesa(){
        System.out.println("O Cliente " + this.cliente.getNome() + " Pagou A Conta e Deixou O Restaurante." + "");
        System.out.println("Mesa " + this.numMesa + " Esta Livre!" + "");
        this.cliente = null;
        this.isFree = true;
        this.isAtendido = false;
    }
    public boolean isAtendido()
    {   
        return this.isAtendido;
    }
    public void setAtendimento()
    {   
        this.isAtendido = true;
    }
    public Cliente clienteInMesa()
    {
        return this.cliente;
    }
    public String toString(){
        if (!this.isFree)
        return "Mesa Ocupada pelo:" + this.cliente.getNome();
        else{return "Mesa Livre";}
	}
}
