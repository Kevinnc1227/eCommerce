public abstract class Vale extends FormaPagamento{
	private String codigo;
	private String nome;
	private String empresa;
	private Data validade;
	
	public Vale(){
		this.setDescricao("Vale");
		this.setValor(0.0f);
		this.setCodigo("");
		this.setNome("");
		this.setEmpresa("");
		this.setValidade(null);
	}
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	
	public String getCodigo(){
		return this.codigo;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setEmpresa(String empresa){
		this.empresa = empresa;
	}
	
	public String getEmpresa(){
		return this.empresa;
	}
	
	public void setValidade(Data validade){
		this.validade = validade;
	}
	
	public Data getValidade(){
		return this.validade;
	}
}