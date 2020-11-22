public class Garcom {
    private boolean isOcupado;
    private int numGarcom;
    public Garcom(int numGarcom)
    {
        this.numGarcom = numGarcom;
    }
    public void setOcupado(boolean Ocupado)
    {
        this.isOcupado = Ocupado; 
    }
    public boolean isOcupado()
    {
        return this.isOcupado;
    }
    
}
