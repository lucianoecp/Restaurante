public class Garcom extends Funcionario{
    private int numGarcom;
    public Garcom(int numGarcom)
    {
        this.numGarcom = numGarcom;
    }
    public void atenderMesa(Mesa mesa)
    {
        mesa.setAtendimento();
    }
    
}
