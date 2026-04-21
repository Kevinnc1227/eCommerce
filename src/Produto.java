public class Produto {
	private String codigo;
	private String nome;
	private String descricao;
	private String tipoProduto;
	private float peso;
	private String unidadePeso;
	private Data validade;
	private String marca;
	private String fabricante;
	private boolean kit;
	private String observacoes;
	private float preco;
	private String unidadePreco;
	private boolean descontoSugerido;
	private CategoriaProduto categoria;
	private String dimensao;
	private String embalagem;
	private boolean inativo;
	private boolean disponivel;
	private String informacaoExtra;
	private float quantidadePorEmbalagem;
	private String lote;
	private String foto;
	
	public Produto() {
		this.codigo = "";
		this.nome = "";
		this.descricao = "";
		this.tipoProduto = "";
		this.peso = -1.0f;
		this.unidadePeso = "";
		this.validade = null;
		this.marca = "";
		this.fabricante = "";
		this.kit = false;
		this.observacoes = "";
		this.preco = 0.0f;
		this.unidadePreco = "";
		this.descontoSugerido = false;
		this.categoria = null;
		this.dimensao = "";
		this.embalagem = "";
		this.inativo = false;
		this.disponivel = true;
		this.informacaoExtra = "";
		this.quantidadePorEmbalagem = 0.0f;
		this.lote = "";
		this.foto = "";
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoProduto() {
		return this.tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public float getPeso() {
		return this.peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getUnidadePeso() {
		return this.unidadePeso;
	}

	public void setUnidadePeso(String unidadePeso) {
		this.unidadePeso = unidadePeso;
	}

	public Data getValidade() {
		return this.validade;
	}

	public void setValidade(Data validade) {
		this.validade = validade;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFabricante() {
		return this.fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public boolean isKit() {
		return this.kit;
	}

	public void setKit(boolean kit) {
		this.kit = kit;
	}

	public String getObservacoes() {
		return this.observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public float getPreco() {
		return this.preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getUnidadePreco() {
		return this.unidadePreco;
	}

	public void setUnidadePreco(String unidadePreco) {
		this.unidadePreco = unidadePreco;
	}

	public boolean isDescontoSugerido() {
		return this.descontoSugerido;
	}

	public void setDescontoSugerido(boolean descontoSugerido) {
		this.descontoSugerido = descontoSugerido;
	}

	public CategoriaProduto getCategoria() {
		return this.categoria;
	}

	public void setCategoria(CategoriaProduto categoria) {
		this.categoria = categoria;
	}

	public String getDimensao() {
		return this.dimensao;
	}

	public void setDimensao(String dimensao) {
		this.dimensao = dimensao;
	}

	public String getEmbalagem() {
		return this.embalagem;
	}

	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}

	public boolean isInativo() {
		return this.inativo;
	}

	public void setInativo(boolean inativo) {
		this.inativo = inativo;
	}

	public boolean isDisponivel() {
		return this.disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getInformacaoExtra() {
		return this.informacaoExtra;
	}

	public void setInformacaoExtra(String informacaoExtra) {
		this.informacaoExtra = informacaoExtra;
	}

	public float getQuantidadePorEmbalagem() {
		return this.quantidadePorEmbalagem;
	}

	public void setQuantidadePorEmbalagem(float quantidadePorEmbalagem) {
		this.quantidadePorEmbalagem = quantidadePorEmbalagem;
	}

	public String getLote() {
		return this.lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
}
