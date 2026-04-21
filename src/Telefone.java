public class Telefone {
	private String ddd;
	private String numero;
	
	public Telefone(){
		this.ddd = "";
		this.numero = "";
	}

	public String getDdd() {
		return this.ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String toString(){
		// https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
		return String.format("(%s) %s", this.getDdd(), this.getNumero() );
	}
}