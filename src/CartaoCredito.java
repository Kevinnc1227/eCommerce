public class CartaoCredito extends Cartao{
    private int quantidadeParcelas;

    public CartaoCredito(){
        super();
        this.setDescricao("Cartao Credito");
        this.setQuantidadeParcelas(1);
    }

    public void setQuantidadeParcelas(int quantidade){
        this.quantidadeParcelas = quantidade;
    }

    public int getQuantidadeParcelas(){
        return this.quantidadeParcelas;
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