public class Endereco {
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	
	public Endereco(){
		this.endereco = "";
		this.numero = "";
		this.complemento = "";
		this.bairro = "";
		this.cidade = "";
		this.estado = "";
		this.pais = "";
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return this.complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getPais() {
		return this.pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}

	public String toString(){
		return 
		"Endereco: " + this.getEndereco() + "\r\n" +
		"Numero: " + this.getNumero() + "\r\n" +
		"Complemento: " + this.getComplemento() + "\r\n" +
		"Bairro: " + this.getBairro() + "\r\n" +
		"Cidade: " + this.getCidade() + "\r\n" +
		"Estado: " + this.getEstado() + "\r\n" +
		"Pais: " + this.getPais();
	}
}