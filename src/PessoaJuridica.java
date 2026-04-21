public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private String nomeFantasia;
	//private String razaoSocial;
	private String ramoAtividade;
	private String cnae;

	public PessoaJuridica(){
		super();
		this.cnpj = "";
		this.nomeFantasia = "";
		//this.razaoSocial = "";
		this.ramoAtividade = "";
		this.cnae = "";
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return this.nomeFantasia;
	}

	public void setNomeFantasia(String nome) {
		this.nomeFantasia = nome;
	}

	//public String getRazaoSocial() {
	//	return this.razaoSocial;
	//}

	//public void setRazaoSocial(String razao) {
	//	this.razaoSocial = razao;
	//}

	public String getRamoAtividade() {
		return this.ramoAtividade;
	}

	public void setRamoAtividade(String ramo) {
		this.ramoAtividade = ramo;
	}

	public String getCnae() {
		return this.cnae;
	}

	public void setCnae(String cnae) {
		this.cnae = cnae;
	}
	
	public static boolean validaCnpj(String cnpj){
		if( cnpj.length() != 14 )
			return false;
		
		int[] pesos1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
		int[] pesos2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

		int soma1=0, soma2=0;
		for( byte i=0; i<12; i++ ){
			soma1 += Integer.parseInt( String.valueOf( cnpj.charAt(i) ) ) * pesos1[i];
			soma2 += Integer.parseInt( String.valueOf( cnpj.charAt(i) ) ) * pesos2[i];
		}
		
		int digito1 = soma1 % 11;
		digito1 = ((digito1==0)||(digito1==1))?0:11-digito1;
		
		soma2 += digito1 * pesos2[12];
		int digito2 = soma2 % 11;
		digito2 = ((digito2==0)||(digito2==1))?0:11-digito2;
		
		if( digito1 != Integer.parseInt( String.valueOf( cnpj.charAt(12) ) ) )
			return false;
		
		if( digito2 != Integer.parseInt( String.valueOf( cnpj.charAt(13) ) ) )
			return false;
		
		return true;
	}
	
	public String toString(){
		return
		"Nome: " + this.getNome() + "\r\n" +
		"Nome Fantasia: " + this.getNomeFantasia() + "\r\n" +
		//"Razao Social: " + this.getRazaoSocial() + "\r\n" +
		"ramoAtividade: " + this.getRamoAtividade() + "\r\n" +
		"CNAE: " + this.getCnae() + "\r\n" +
		"CNPJ: " + this.getCnpj() + "\r\n" +
		"Telefone: " + this.getTelefone().toString() + "\r\n" +
		"Email: " + this.getEmail() + "\r\n" +
		"Pontuacao: " + this.getPontuacao() + "\r\n" +
		"Foto: " + this.getFoto() + "\r\n" +
		"Observacoes: " + this.getObservacoes();
	}
}