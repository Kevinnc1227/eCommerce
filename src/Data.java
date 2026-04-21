public class Data {
	private short ano;
	private byte mes;
	private byte dia;
	
	public Data(){
		this.ano = -1;
		this.mes = -1;
		this.dia = -1;
	}

	public Data(byte dia, byte mes, short ano) throws Exception{
		this.setAno(ano);
		this.setMes(mes);
		this.setDia(dia);
	}
	
	public void setAno(short ano) throws Exception{
		if( (1900 <= ano) && (ano <= 2300) ) {
			this.ano = ano;
		}
		else {
			throw new Exception("Gerou uma exceção pois deve ser 1900 <= ano <= 2300");
		}
	}
	
	public short getAno(){
		return this.ano;
	}
	
	public void setMes(byte mes) throws Exception{
		if( (1 <= mes) && (mes <= 12) ) {
			this.mes = mes;
		}
		else {
			throw new Exception("Gerou uma exceção pois deve ser 1 <= mes <= 12");
		}
	}
	
	public byte getMes(){
		return this.mes;
	}
	
	public void setDia(byte dia) throws Exception {
		if( (1 <= dia) && (dia <= 31) ) {
			this.dia = dia;
		}
		else {
			throw new Exception("Gerou uma exceção pois deve ser 1 <= dia <= 31");
		}
	}
	
	public byte getDia(){
		return this.dia;
	}

	public String toString(){
		// https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
		return String.format("%02d/%02d/%4d", this.getDia(), this.getMes(), this.getAno() );
	}
}