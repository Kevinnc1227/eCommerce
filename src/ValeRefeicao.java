public class ValeRefeicao extends Vale{
	/*
	public ValeRefeicao(){
		this.setDescricao("Vale Refeicao");
		this.setValor(0.0f);
		this.setCodigo("");
		this.setNome("");
		this.setEmpresa("");
		this.setValidade(null);
	}
	*/
	public ValeRefeicao(){
		super();
		this.setDescricao("Vale Refeicao");
	}
	
	public boolean pagar(){
		// TODO: Implementar requisicao ao API da Sodexo
		return true;
	}
}