public class ValeAlimentacao extends Vale{
	/*
	public ValeAlimentacao(){
		this.setDescricao("Vale Alimentacao");
		this.setValor(0.0f);
		this.setCodigo("");
		this.setNome("");
		this.setEmpresa("");
		this.setValidade(null);
	}
	*/
	public ValeAlimentacao(){
		super();
		this.setDescricao("Vale Alimentacao");
	}
	
	public boolean pagar(){
		// TODO: Implementar requisicao ao API da Sodexo
		return true;
	}
}