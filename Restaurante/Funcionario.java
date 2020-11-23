public abstract class Funcionario {
    private boolean isOcupado;
    private int numFuncionario;

    public Funcionario(int numFuncionario){
        this.numFuncionario = numFuncionario;
    }
    //public int getFuncionario(int numFuncionario){
    //   return this.numFuncionario
    //}
	public boolean isOcupado() {
		return this.isOcupado;
    }
    
	public void setOcupado(boolean Ocupado) {
        this.isOcupado = Ocupado;
    }

    public String toString(){
        if (this.isOcupado)
        return "Funcionario Ocupado";
        else{return "Funcionario Livre";}
	}
    
}
