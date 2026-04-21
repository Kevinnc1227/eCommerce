public class Entrega {
	private Endereco endereco;
	private TipoEntrega tipoEntrega;
	
	public Entrega() {
		this.endereco = new Endereco();
		this.tipoEntrega = TipoEntrega.RETIRADA_LOCAL;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public TipoEntrega getTipoEntrega() {
		return this.tipoEntrega;
	}

	public void setTipoEntrega(TipoEntrega tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}
}
