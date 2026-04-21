public class CustomizeException extends Exception {
	private String message;
	private String campo;
	private String valor;
	
	public CustomizeException(String message, String campo, String valor) {
		this.message = message;
		this.campo = campo;
		this.valor = valor;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String getFullMessage() {
		return this.getMessage() + ": " + this.getCampo() + " -> " + this.getValor();
	}
}
