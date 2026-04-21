import java.util.ArrayList;

public class Compra {
	private ArrayList<Pedido> pedidos;
	private Pagamento pagamento;
	private Entrega entrega;
	
	public Compra() {
		this.pedidos = new ArrayList<Pedido>();
		this.pagamento = new Pagamento();
		this.entrega = new Entrega();
	}

	public ArrayList<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Pagamento getPagamento() {
		return this.pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Entrega getEntrega() {
		return this.entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
}
