public /*abstract */ class FormaPagamento{
	private String descricao;
	private float valor;
	
	public FormaPagamento(){
		this.descricao = "";
		this.valor = 0.0f;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public float getValor(){
		return this.valor;
	}
	
	public void setValor(float valor){
		this.valor = valor;
	}
	
	public /*abstract*/ boolean pagar() {
	return false;
	}
}