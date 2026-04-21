public class Dinheiro extends FormaPagamento{
	public Dinheiro(){
		this.setDescricao("Dinheiro");
		this.setValor(0.0f);
	}
	
	public boolean pagar(){
		return true;
	}
}