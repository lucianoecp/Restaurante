public class Cozinheiro extends Funcionario{
    private boolean isOcupado;
    public Cozinheiro(){}
    
	@Override
	public boolean isOcupado() {
		
		return this.isOcupado;
	}

	@Override
	public void setOcupado(boolean Ocupado) {
        this.isOcupado = Ocupado;
	}
    
}
