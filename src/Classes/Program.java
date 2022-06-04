package Classes;
import javax.swing.*;
import java.awt.event.*;  
import java.util.*;


public class Program {
	
	
	static ArrayList<Aviao> avioes = new ArrayList<Aviao>();
	static ArrayList<Voo> voos = new ArrayList<Voo>();
	
	static Scanner scan = new Scanner(System.in);
	
	static JFrame frame = new JFrame("Menu principal");
	
	public static void main(String[] args) {
		
		
		GraphicUserInterface Gui = new GraphicUserInterface();
		
		
		
		
	}

	
	
	
	public static void CadastrarAviao()
	{
		System.out.println("Informe o modelo: ");
		String modelo = scan.next();
		
		System.out.println("Informe o nº de fileiras: ");
		int fileiras = scan.nextInt();
		
		
		System.out.println("Informe o nº de cadeiras por fileira: ");
		int assentos = scan.nextInt();
		
		
		Aviao aviao = new Aviao(modelo, fileiras, assentos);
		
		avioes.add(aviao);
		
	}
	
	
	public static void CadastrarVoo()
	{
		Voo voo = new Voo(avioes.get(0), "São Paulo, SP", "Rio de Janeiro, RJ", "23/06", "13:15");
	}
	
	
}
