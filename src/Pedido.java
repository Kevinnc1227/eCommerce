public class Pedido {
	private Data data;
	private Hora hora;
	private Pessoa cliente;
	private PessoaJuridica fornecedor;
	private Produto[] produtos;
	private int[] quantidadeProdutos;

	public Pedido() {
		this.data = null;
		this.hora = null;
		this.cliente = null;
		this.fornecedor = null;
		this.produtos = null;
		this.quantidadeProdutos = null;
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

	public Pessoa getCliente() {
		return this.cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public PessoaJuridica getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(PessoaJuridica fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Produto[] getProdutos() {
		return this.produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	public int[] getQuantidadeProdutos() {
		return this.quantidadeProdutos;
	}

	public void setQuantidadeProdutos(int[] quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
	}
}