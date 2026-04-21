import java.util.ArrayList;

public class Pagamento {
	private ArrayList<FormaPagamento> formaPagamento;
	private float valor;
	
	public Pagamento() {
		this.formaPagamento = new ArrayList<FormaPagamento>();
		this.valor = 0.0f;
	}
	
	public ArrayList<FormaPagamento> getFormaPagamento() {
		return this.formaPagamento;
	}
	
	public void setFormaPagamento(ArrayList<FormaPagamento> formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public float getValor() {
		return this.valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
}
