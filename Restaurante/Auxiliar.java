public class Auxiliar{
    
    private int numCliente = 0;
    private String nomeCliente;

    public Cliente makeCliente(){
        this.numCliente += 1;
        this.nomeCliente = "Cliente" + this.numCliente;
        return new Cliente(this.nomeCliente,this.numCliente);
    }

}