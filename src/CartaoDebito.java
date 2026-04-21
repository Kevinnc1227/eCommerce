public class CartaoDebito extends Cartao{

    public CartaoDebito(){
        super();
        this.setDescricao("Cartao Debito");
    }

    public boolean pagar() {
        // TODO: Implementar a conexao com API da empresa do cartão
        return true;
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}