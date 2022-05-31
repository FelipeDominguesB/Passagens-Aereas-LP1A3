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
	
	

}
