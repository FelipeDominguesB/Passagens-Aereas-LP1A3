package Classes;

public class Voo {
	
	
	private static int nroVoo = 0;
	
	private Aviao aeronave;
	private int nro;
	
	private String saidaEm;
	private String chegadaEm;
	
	private String data;
	private String hora;
	
	public Voo(Aviao aeronave, String saidaEm, String chegadaEm, String data, String hora) {
		this.aeronave = aeronave;
		this.nro = nroVoo;
		this.data = data;
		this.hora = hora;
		this.saidaEm = saidaEm;
		this.chegadaEm = chegadaEm;
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
	
	
	public String getSaidaEm() {
		return saidaEm;
	}


	public void setSaidaEm(String saidaEm) {
		this.saidaEm = saidaEm;
	}


	public String getChegadaEm() {
		return chegadaEm;
	}


	public void setChegadaEm(String chegadaEm) {
		this.chegadaEm = chegadaEm;
	}

	
	

}
