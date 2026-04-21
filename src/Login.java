public class Login{
	private String id;
    private String codigo;
    private String senha;

    public Login(){
    	this.id = "";
        this.codigo = "";
        this.senha = "";
    }
    
    public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean validateLogin() {
		if( (this.getId().length() > 0) && (this.getCodigo().length() > 0) && (this.getSenha().length() > 0) ) {
			return true;
		}
		return false;
	}
}