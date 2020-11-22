public class Mesa {
    private boolean isFree=true;
    private boolean isAtendido;
    private Cliente cliente;
    private int numMesa;
    public Mesa(int numMesa){
        this.numMesa = numMesa;
    }
    public boolean checkMesa(){
        return this.isFree;
    }
    public void ocupaMesa(Cliente cliente)
    {   System.out.println("O Cliente " + this.cliente.getNome() + " Ocupou a Mesa " + this.numMesa);
        this.cliente = cliente;
        this.isFree = false;
    }
    public void liberaMesa(){
        System.out.println("O Cliente " + this.cliente.getNome() + " Pagou A Conta e Deixou O Restaurante.");
        System.out.println("Mesa " + this.numMesa + " Esta Livre!");
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
        System.out.println("O Cliente " + this.cliente.getNome() + "Foi Atendido pelo Garcom");
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
