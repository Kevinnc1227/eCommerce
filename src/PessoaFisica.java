public class PessoaFisica extends Pessoa{
	private String cpf;
	private String sobrenome;
	private Data dataNascimento;
	private Sexo sexo;
	private EstadoCivil estadoCivil;

	public PessoaFisica(){
		super();
		this.cpf = "";
		this.sobrenome = "";
		this.dataNascimento = null;
		this.sexo = null;
		this.estadoCivil = null;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Data getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Sexo getSexo() {
		return this.sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public EstadoCivil getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public static boolean validaCpf(String cpf){
		if( cpf.length() != 11 )
			return false;
		
		int soma1=0, soma2=0;
		for( byte i=0; i<9; i++ ){
			soma1 += Integer.parseInt( String.valueOf( cpf.charAt(i) ) ) * (i + 1);
			soma2 += Integer.parseInt( String.valueOf( cpf.charAt(i) ) ) * i;
		}
		int digito1 = soma1 % 11;
		digito1 = digito1==10?0:digito1;
		int digito2 = soma2 % 11;
		digito2 = digito2==10?0:digito2;
		if( digito1 != Integer.parseInt( String.valueOf( cpf.charAt(9) ) ) )
			return false;
		if( digito2 != Integer.parseInt( String.valueOf( cpf.charAt(10) ) ) )
			return false;

		return true;
	}

	public String toString(){
		return
		"Nome: " + this.getNome() + "\r\n" +
		"Sobrenome: " + this.getSobrenome() + "\r\n" +
		"Data Nascimento: " + this.getDataNascimento().toString() + "\r\n" +
		"Sexo: " + this.getSexo().name() + "\r\n" +
		"Estado Civil: " + this.getEstadoCivil().name() + "\r\n" +
		"CPF: " + this.getCpf() + "\r\n" +
		"Telefone: " + this.getTelefone().toString() + "\r\n" +
		"Email: " + this.getEmail() + "\r\n" +
		"Pontuacao: " + this.getPontuacao() + "\r\n" +
		"Foto: " + this.getFoto() + "\r\n" +
		"Observacoes: " + this.getObservacoes();
	}
}