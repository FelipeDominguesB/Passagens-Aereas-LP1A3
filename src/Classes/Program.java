package Classes;
import javax.swing.*;
import java.awt.event.*;  

public class Program {

	public static void main(String[] args) {
		
		CreateMainPage();
		
	}

	
	
	public static void CreateMainPage()
	{
		final JFrame frame = new JFrame("Menu principal");
		
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
				frame.setVisible(false);
				CreateSysParamsPage();
				
			}
		});
		btnOpcao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				frame.setVisible(false);
				CreatePassageReservationPage();
				
			}
		});
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void CreateSysParamsPage()
	{
		final JFrame frame = new JFrame("Parametros do sistema");		
		JButton btnOpcao1 = new JButton("1 - Cadastrar aeronave");
		JButton btnOpcao2 = new JButton("2 - Cadastrar Voo");
		JButton btnOpcao3 = new JButton("3 - Voltar");
		
		
		frame.add(btnOpcao1);
		frame.add(btnOpcao2);
		frame.add(btnOpcao3);
		
		btnOpcao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				frame.setVisible(false);
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
		final JFrame frame = new JFrame("Reserva de passagens");		
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
				frame.setVisible(false);
				CreateMainPage();
				
			}
		});
		
		
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
