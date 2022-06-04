package Classes;
import javax.swing.*;

import java.awt.Component;
import java.awt.event.*;  
import java.util.*;
public class Program {
	
	
	static ArrayList<Aviao> avioes = new ArrayList<Aviao>();
	static ArrayList<Voo> voos = new ArrayList<Voo>();
	
	static Scanner scan = new Scanner(System.in);
	
	static JFrame frame = new JFrame("Menu principal");
	
	public static void main(String[] args) {
		
		CreateMainPage();
		
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
		Voo voo = new Voo(avioes.get(0), "23/06", "13:15");
	}
	
	public static void CreateMainPage()
	{
		
		
		JButton btnOpcao1 = new JButton("1 - Parametros do sistema");
		JButton btnOpcao2 = new JButton("2 - Reserva de passagens");
		JButton btnOpcao3 = new JButton("3 - Sair");
		
		
		frame.add(btnOpcao1);
		frame.add(btnOpcao2);
		frame.add(btnOpcao3);
		
		
		
		btnOpcao1.setBounds(10,10,260,30);
		btnOpcao2.setBounds(10,60,260,30);
		btnOpcao3.setBounds(10,200,260,30);
		
		btnOpcao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				btnOpcao1.setVisible(false);
				btnOpcao2.setVisible(false);
				btnOpcao3.setVisible(false);
				
				frame.remove(btnOpcao1);
				frame.remove(btnOpcao2);
				frame.remove(btnOpcao3);	
				
				CreateSysParamsPage();
				
			}
		});
		btnOpcao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				btnOpcao1.setVisible(false);
				btnOpcao2.setVisible(false);
				btnOpcao3.setVisible(false);
				
				frame.remove(btnOpcao1);
				frame.remove(btnOpcao2);
				frame.remove(btnOpcao3);
				
				
				
				CreatePassageReservationPage();
				
			}
		});
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		

	}
	
	public static void CreateSysParamsPage()
	{
			
		JButton btnOpcao1 = new JButton("1 - Cadastrar aeronave");
		JButton btnOpcao2 = new JButton("2 - Cadastrar Voo");
		JButton btnOpcao3 = new JButton("3 - Voltar");
	
		frame.add(btnOpcao1);
		frame.add(btnOpcao2);
		frame.add(btnOpcao3);
		
		btnOpcao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				btnOpcao1.setVisible(false);
				btnOpcao2.setVisible(false);
				btnOpcao3.setVisible(false);
				
				frame.remove(btnOpcao1);
				frame.remove(btnOpcao2);
				frame.remove(btnOpcao3);
				
				
				CreateMainPage();
				
			}
		});
		
		
		btnOpcao1.setBounds(10,10,260,30);
		btnOpcao2.setBounds(10,60,260,30);
		btnOpcao3.setBounds(10,200,260,30);
		
		
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	
	public static void CreatePassageReservationPage()
	{
			
		JButton btnOpcao1 = new JButton("1 - Fazer reserva");
		JButton btnOpcao2 = new JButton("2 - Consultar lugares vazios");
		JButton btnOpcao3 = new JButton("3 - Consultar reservas realizadas");
		JButton btnOpcao4 = new JButton("4 - Voltar");
		
		
		frame.add(btnOpcao1);
		frame.add(btnOpcao2);
		frame.add(btnOpcao3);
		frame.add(btnOpcao4);
		
		btnOpcao1.setBounds(10,10,260,30);
		btnOpcao2.setBounds(10,60,260,30);
		btnOpcao3.setBounds(10,110,260,30);
		btnOpcao4.setBounds(10,200,260,30);
		
		btnOpcao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				btnOpcao1.setVisible(false);
				btnOpcao2.setVisible(false);
				btnOpcao3.setVisible(false);
				btnOpcao4.setVisible(false);
				
				frame.remove(btnOpcao1);
				frame.remove(btnOpcao2);
				frame.remove(btnOpcao3);
				frame.remove(btnOpcao4);
				
				
				
				CreateMainPage();
				
			}
		});
		
		
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
}
