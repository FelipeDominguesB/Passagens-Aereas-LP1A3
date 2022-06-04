package Classes;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GraphicUserInterface extends JFrame{
	

	public GraphicUserInterface()
	{
		
		ConfigureFrame();
		CreateMainPage();
		
	}
	
	private void ConfigureFrame()
	{
		System.out.println("Cheguei aqui");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		
	}
	
	public void CreateMainPage()
	{
		
		setTitle("Página principal");
		JButton btnOpcao1 = new JButton("1 - Parametros do sistema");
		JButton btnOpcao2 = new JButton("2 - Reserva de passagens");
		JButton btnOpcao3 = new JButton("3 - Sair");
		
		
		add(btnOpcao1);
		add(btnOpcao2);
		add(btnOpcao3);
		
		
		
		btnOpcao1.setBounds(10,10,260,30);
		btnOpcao2.setBounds(10,60,260,30);
		btnOpcao3.setBounds(10,200,260,30);
		
		
		btnOpcao1.addActionListener((event) -> {
			btnOpcao1.setVisible(false);
			btnOpcao2.setVisible(false);
			btnOpcao3.setVisible(false);
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);	
			
			CreateSysParamsPage();
			
		});
		
		btnOpcao2.addActionListener((event) -> {
			btnOpcao1.setVisible(false);
			btnOpcao2.setVisible(false);
			btnOpcao3.setVisible(false);
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);
			
			CreatePassageReservationPage();
		});
		
		btnOpcao3.addActionListener((event) -> System.exit(0));
		
		
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
		

	}
	
	public void CreateSysParamsPage()
	{
		setTitle("Parâmetros do sistema");
		JButton btnOpcao1 = new JButton("1 - Cadastrar aeronave");
		JButton btnOpcao2 = new JButton("2 - Cadastrar Voo");
		JButton btnOpcao3 = new JButton("3 - Voltar");
	
		add(btnOpcao1);
		add(btnOpcao2);
		add(btnOpcao3);
		
		
		btnOpcao1.addActionListener((event) ->{
			btnOpcao1.setVisible(false);
			btnOpcao2.setVisible(false);
			btnOpcao3.setVisible(false);
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);
			
			createPlane();
		});
		
		btnOpcao3.addActionListener(event ->{
			
			btnOpcao1.setVisible(false);
			btnOpcao2.setVisible(false);
			btnOpcao3.setVisible(false);
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);
			
			
			CreateMainPage();
		});
		
		
		btnOpcao1.setBounds(10,10,260,30);
		btnOpcao2.setBounds(10,60,260,30);
		btnOpcao3.setBounds(10,200,260,30);
		
		
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
	
	}
	
	
	public void CreatePassageReservationPage()
	{
		setTitle("Reserva de passagens");
		JButton btnOpcao1 = new JButton("1 - Fazer reserva");
		JButton btnOpcao2 = new JButton("2 - Consultar lugares vazios");
		JButton btnOpcao3 = new JButton("3 - Consultar reservas realizadas");
		JButton btnOpcao4 = new JButton("4 - Voltar");
		
		
		add(btnOpcao1);
		add(btnOpcao2);
		add(btnOpcao3);
		add(btnOpcao4);
		
		btnOpcao1.setBounds(10,10,260,30);
		btnOpcao2.setBounds(10,60,260,30);
		btnOpcao3.setBounds(10,110,260,30);
		btnOpcao4.setBounds(10,200,260,30);
		
		
		btnOpcao1.addActionListener((event) -> {
			
			btnOpcao1.setVisible(false);
			btnOpcao2.setVisible(false);
			btnOpcao3.setVisible(false);
			btnOpcao4.setVisible(false);
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);
			remove(btnOpcao4);
			
			MakeReservation();
				
			
		});
		
		btnOpcao2.addActionListener((event) -> {
			
			btnOpcao1.setVisible(false);
			btnOpcao2.setVisible(false);
			btnOpcao3.setVisible(false);
			btnOpcao4.setVisible(false);
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);
			remove(btnOpcao4);
			
			seeReservations(false);
				
			
		});
		
		btnOpcao3.addActionListener((event) -> {
			
			btnOpcao1.setVisible(false);
			btnOpcao2.setVisible(false);
			btnOpcao3.setVisible(false);
			btnOpcao4.setVisible(false);
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);
			remove(btnOpcao4);
			
			seeReservations(true);
				
			
		});
		
		btnOpcao4.addActionListener((event) ->{
				
			btnOpcao1.setVisible(false);
			btnOpcao2.setVisible(false);
			btnOpcao3.setVisible(false);
			btnOpcao4.setVisible(false);
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);
			remove(btnOpcao4);
			
			
			
			CreateMainPage();
				

		});
		
		
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
		
		
	}
	
	public void MakeReservation()
	{
		
		if(Program.voos.size() >0)
		{
			setTitle("Fazer reserva");
		
			JLabel lblNome = new JLabel("Nome do viajante: ");
			JLabel lblCpf = new JLabel("CPF do viajante: ");
			JLabel lblFileira = new JLabel("Fileira: ");
			JLabel lblAssento = new JLabel("Assento: ");
			
			JTextField txtNome = new JTextField();
			JTextField txtCpf = new JTextField();
			JTextField txtFileira = new JTextField();
			JTextField txtAssento = new JTextField();
			
			JButton btnEnviar = new JButton("Fazer reserva");
			JButton btnVoltar = new JButton("Voltar");
			
			add(lblNome);
			add(txtNome);
			add(lblCpf);
			add(txtCpf);
			
			
			lblNome.setBounds(10,10,260,30);
			txtNome.setBounds(10,35,260,30);
			
			lblCpf.setBounds(10,80,260,30);
			txtCpf.setBounds(10,105,260,30);
			
			
			
			btnVoltar.setBounds(10,200,260,30);
			
			setSize(300, 400);
			setLayout(null);
			setVisible(true);
			
		}
		else {
			JOptionPane.showMessageDialog(this, "Não há voos cadastrados!");
			CreatePassageReservationPage();
		}
		
		
	}
	
	
	public void seeReservations(Boolean seeVacantSpots)
	{
		if(Program.voos.size() >0)
		{
			
		}
		else {
			JOptionPane.showMessageDialog(this, "Não há voos cadastrados!");
			CreatePassageReservationPage();
		}
	}
	
	public void createPlane()
	{
		setTitle("Cadastrar avião");
		
		JLabel lblModelo = new JLabel("Modelo do avião: ");
		JLabel lblFileiras = new JLabel("Número de fileiras: ");
		JLabel lblAssentos = new JLabel("Número de assentos por fileira: ");
		
		
		JTextField txtModelo = new JTextField();
		JTextField txtFileiras = new JTextField();
		JTextField txtAssentos = new JTextField();


		JButton btnCriar = new JButton("Criar");
		JButton btnVoltar = new JButton("Voltar");
		
		
		
		lblModelo.setBounds(10,10,260,30);
		txtModelo.setBounds(10,35,260,30);
		
		lblFileiras.setBounds(10,70,260,30);
		txtFileiras.setBounds(10,95,260,30);
		
		lblAssentos.setBounds(10,130,260,30);
		txtAssentos.setBounds(10,155,260,30);
		
		btnCriar.setBounds(10,200,120,30);
		btnVoltar.setBounds(150,200,120,30);
		
		add(lblModelo);
		add(txtModelo);
		
		add(lblFileiras);
		add(txtFileiras);
		
		add(lblAssentos);
		add(txtAssentos);
		
		add(btnCriar);
		add(btnVoltar);
		
		
		btnCriar.addActionListener((event) -> {
			
			try {
				String modelo = txtModelo.getText();
				int nroFileiras = Integer.parseInt(txtFileiras.getText());
				int nroAssentos = Integer.parseInt(txtAssentos.getText());
							
				Aviao novoAviao = new Aviao(modelo, nroFileiras, nroAssentos);
				
				
				Program.avioes.add(novoAviao);
				JOptionPane.showMessageDialog(this, "Cadastrado com sucesso");
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(this, "O valor de fileiras e assentos por fileiras devem ser ambos números",  "Erro!", JOptionPane.ERROR_MESSAGE);
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(this, "Erro inesperado, contatar administrador do sistema!",  "Erro!", JOptionPane.ERROR_MESSAGE);
			}
			
			
		});
		
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void createFlight()
	{
		setTitle("Criar voo");
		
		JLabel lblNome = new JLabel("Local de saída: ");
		JLabel lblCpf = new JLabel("Local de chegada: ");
		JLabel lblFileira = new JLabel("Fileira: ");
		JLabel lblAssento = new JLabel("Assento: ");
		
		JTextField txtNome = new JTextField();
		JTextField txtCpf = new JTextField();
		JTextField txtFileira = new JTextField();
		JTextField txtAssento = new JTextField();
		
		JButton btnEnviar = new JButton("Fazer reserva");
		JButton btnVoltar = new JButton("Voltar");
		
		add(lblNome);
		add(txtNome);
		add(lblCpf);
		add(txtCpf);
		add(lblNome);
		
	}
	
}
