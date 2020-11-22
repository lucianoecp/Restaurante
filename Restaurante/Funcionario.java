public abstract class Funcionario {
    private boolean isOcupado;
    
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
