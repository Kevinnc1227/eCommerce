public class Hora {
	private byte horas;
	private byte minutos;
	private byte segundos;
	
	public Hora(){
		this.horas = -1;
		this.minutos = -1;
		this.segundos = -1;
	}
	
	public void setHoras(byte horas){
		this.horas = horas;
	}
	
	public byte getHoras(){
		return this.horas;
	}
	
	public void setMinutos(byte minutos){
		this.minutos = minutos;
	}
	
	public byte getMinutos(){
		return this.minutos;
	}
	
	public void setSegundos(byte segundos){
		this.segundos = segundos;
	}
	
	public byte getSegundos(){
		return this.segundos;
	}
}
