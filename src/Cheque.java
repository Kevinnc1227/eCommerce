public class Cheque extends FormaPagamento{
	private int compensacao;
	private int banco;
	private int digitoVerificador1;
	private int numeroConta;
	private int digitoVerificador2;
	private int numoroCheque;
	private int digitoVerificador3;
	private Data data;
	private Pessoa cliente;
	private Data clienteDesde;
	
	public Cheque() {
		this.compensacao = -1;
		this.banco = -1;
		this.digitoVerificador1 = -1;
		this.numeroConta = -1;
		this.digitoVerificador2 = -1;
		this.numoroCheque = -1;
		this.digitoVerificador3 = -1;
		this.data = null;
		this.cliente = null;
		this.clienteDesde = null;
	}
	public int getCompensacao() {
		return this.compensacao;
	}

	public void setCompensacao(int compensacao) {
		this.compensacao = compensacao;
	}

	public int getBanco() {
		return this.banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public int getDigitoVerificador1() {
		return this.digitoVerificador1;
	}

	public void setDigitoVerificador1(int digitoVerificador1) {
		this.digitoVerificador1 = digitoVerificador1;
	}

	public int getNumeroConta() {
		return this.numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigitoVerificador2() {
		return this.digitoVerificador2;
	}

	public void setDigitoVerificador2(int digitoVerificador2) {
		this.digitoVerificador2 = digitoVerificador2;
	}

	public int getNumoroCheque() {
		return this.numoroCheque;
	}

	public void setNumoroCheque(int numoroCheque) {
		this.numoroCheque = numoroCheque;
	}

	public int getDigitoVerificador3() {
		return this.digitoVerificador3;
	}

	public void setDigitoVerificador3(int digitoVerificador3) {
		this.digitoVerificador3 = digitoVerificador3;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Pessoa getCliente() {
		return this.cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Data getClienteDesde() {
		return this.clienteDesde;
	}

	public void setClienteDesde(Data clienteDesde) {
		this.clienteDesde = clienteDesde;
	}
	
	public boolean pagar(){
		if( this.getCliente() == null )
			return false;
		if( this.getBanco() > 0 )
			return false;
		if( this.getNumeroConta() > 0 )
			return false;
		return true;
	}
}