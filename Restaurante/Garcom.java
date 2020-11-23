public class Garcom extends Funcionario{
    public Garcom(int numGarcom)
    {
        super(numGarcom);
    }
    public void atenderMesa(Mesa mesa)
    {   System.out.println("\nO Garcom Atendeu a Mesa" + mesa.getNumMesa() + "");
        mesa.setAtendimento();
    }
    
}
