package Classes;

public class Passageiro {
	
	private String nome;
	private String cpf;
	
	public Passageiro(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public String getNome(String nome) {
		return this.nome;
	}
		
	public String getCPF(String cpf) {
		return this.cpf;
	}
	
}

