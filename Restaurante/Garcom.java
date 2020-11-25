public class Garcom extends Pessoa{
    public Garcom(int numGarcom)
    {
        super(numGarcom);
    }
    public void atenderMesa(Mesa mesa)
    {   System.out.println("\nO Garcom " + this.getNomePessoa() + "Atendeu a Mesa " + mesa.getNumMesa() + "");
        mesa.setAtendimento();
    }
    
}
