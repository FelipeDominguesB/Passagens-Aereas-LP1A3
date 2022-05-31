package Classes;

public class Aviao extends Aeronave{
	
	public Passageiro[][] lugares;
	
	public Aviao(String modelo, int fileira, int assento) {
		super(modelo);
		lugares = new Passageiro[fileira][assento];
	}
	
	public boolean verificaLugarOcupado(int fileira, int assento) {
		if (lugares[fileira][assento] == null)
			return false;
		else
			return true;
	}

	public Passageiro getPassageiro(int fileira, int assento) {
		return lugares[fileira][assento];
	}
	
	public void setPassageiro(int fileira, int assento, Passageiro pessoa) {
		this.lugares[fileira][assento] = pessoa;
	}
}
