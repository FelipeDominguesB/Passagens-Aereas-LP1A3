package Classes;

public class Voo {
	
	
	private static int nroVoo = 0;
	
	private Aviao aeronave;
	private int nro;
	private String data;
	private String hora;
	
	public Voo(Aviao aeronave, String data, String hora) {
		this.aeronave = aeronave;
		this.nro = nroVoo;
		this.data = data;
		this.hora = hora;
		
		nroVoo++;
	}
	
	
	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public int getNro() {
		return nro;
	}	
	
	
	public Aviao getAeronave()
	{
		return this.aeronave;
	}
	
	
	

}
