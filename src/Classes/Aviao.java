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
		return lugares[fileira-1][assento-1] != null;
	}

	public Passageiro getPassageiro(int fileira, int assento) {
		return lugares[fileira-1][assento-1];
	}
	
	public boolean setPassageiro(Passageiro pessoa, int fileira, int assento) {
		
		if(verificaLugarOcupado(fileira, assento))
		{
			return false;
		}
		this.lugares[fileira-1][assento-1] = pessoa;
		
		return true;
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
