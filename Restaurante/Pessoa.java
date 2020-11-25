public abstract class Pessoa {
    private boolean isOcupado;
    private int numPessoa;
    private String nomePessoa;

    public Pessoa(int numPessoa, String nomePessoa) {
        this.numPessoa = numPessoa;
        this.nomePessoa = nomePessoa;   
    }
    
    public Pessoa(int numPessoa){
        this.numPessoa = numPessoa;
    }

    public int getIdPessoa(){
       return this.numPessoa;
    }
    public String getNomePessoa(){
        if(this.nomePessoa instanceof String)
            return this.nomePessoa + this.numPessoa;
        else{return Integer.toString(this.numPessoa);}
    }
	public boolean isOcupado(){
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
