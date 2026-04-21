public class Estoque {
	private PessoaJuridica fornecedor;
	private Movimentacao tipoMovimentacao;
	private Data data;
	private Hora hora;
	private Produto produto;
	private float quantidade;
	private String unidadeQuantidade;
	
	public Estoque() {
		this.fornecedor = null;
		this.tipoMovimentacao = null;
		this.data = null;
		this.hora = null;
		this.produto = null;
		this.quantidade = -1.0f;
		this.unidadeQuantidade = "";
	}
	
	public PessoaJuridica getFornecedor() {
		return this.fornecedor;
	}
	
	public void setFornecedor(PessoaJuridica fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public Movimentacao getTipoMovimentacao() {
		return this.tipoMovimentacao;
	}
	
	public void setTipoMovimentacao(Movimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
	
	public Data getData() {
		return this.data;
	}
	
	public void setData(Data data) {
		this.data = data;
	}
	
	public Hora getHora() {
		return this.hora;
	}
	
	public void setHora(Hora hora) {
		this.hora = hora;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public float getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	public String getUnidadeQuantidade() {
		return this.unidadeQuantidade;
	}
	
	public void setUnidadeQuantidade(String unidadeQuantidade) {
		this.unidadeQuantidade = unidadeQuantidade;
	}
}