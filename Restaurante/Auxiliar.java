public class Auxiliar{
    private int numCliente = 0;
    public String makeCliente(){
        this.numCliente += 1;
        return "Cliente" + this.numCliente + " Entrou no Restaurante!"; 
    }

}