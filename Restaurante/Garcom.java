public class Garcom extends Funcionario{
    private int numGarcom;
    public Garcom(int numGarcom)
    {
        this.numGarcom = numGarcom;
    }
    public void atenderMesa(Mesa mesa)
    {   System.out.println("O Garcom " + this.numGarcom + " Atendeu a Mesa" + mesa.getNumMesa());
        mesa.setAtendimento();
    }
    
}
