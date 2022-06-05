package Classes;

public class Aviao extends Aeronave{
	
	public Passageiro[][] lugares;
	private int fileiras;
	private int assentosPorFileira;
	
	public Aviao(String modelo, int fileira, int assento) {
		super(modelo);
		fileiras = fileira;
		assentosPorFileira = assento;
		lugares = new Passageiro[fileira][assento];
	}
	
	public boolean verificaLugarOcupado(int fileira, int assento) {
		return lugares[fileira][assento] == null;
	}

	public Passageiro getPassageiro(int fileira, int assento) {
		return lugares[fileira][assento];
	}
	
	public void setPassageiro(int fileira, int assento, Passageiro pessoa) {
		this.lugares[fileira][assento] = pessoa;
	}
	
	public int getFileiras()
	{
		return fileiras;
	}
	
	public int getAssentosPorFileira()
	{
		return assentosPorFileira;
	}
}
