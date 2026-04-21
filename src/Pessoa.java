public abstract class Pessoa {
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	private String email;
	private float pontuacao;
	private String foto;
	private String observacoes;
	
	public Pessoa(){
		this.nome = "";
		this.endereco = null;
		this.telefone = null;
		this.email = "";
		this.pontuacao = 0.0f;
		this.foto = "";
		this.observacoes = "";
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(float pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public abstract String toString();
}