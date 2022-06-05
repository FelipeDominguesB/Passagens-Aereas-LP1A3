package Classes;

import Exceptions.*;


import javax.swing.*;
import java.text.*;

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
		revalidate();
		repaint();
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
			
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);	
			
			CreateSysParamsPage();
			
		});
		
		btnOpcao2.addActionListener((event) -> {
			
			
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
		
	
		revalidate();
		repaint();
		
		setTitle("Parâmetros do sistema");
		JButton btnOpcao1 = new JButton("1 - Cadastrar aeronave");
		JButton btnOpcao2 = new JButton("2 - Cadastrar Voo");
		JButton btnOpcao3 = new JButton("3 - Voltar");
	
		add(btnOpcao1);
		add(btnOpcao2);
		add(btnOpcao3);
		
		
		btnOpcao1.addActionListener((event) ->{
			
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);
			
			createPlane();
		});
		
		btnOpcao2.addActionListener(event ->{
			
			
			if(Program.avioes.size() > 0)
			{
				
				remove(btnOpcao1);
				remove(btnOpcao2);
				remove(btnOpcao3);
				
				
				createFlight();
			}
			else {
				JOptionPane.showMessageDialog(this, "Não é possível cadastrar um voo sem que haja o cadastro de aviões no sistema",  "Erro!", JOptionPane.ERROR_MESSAGE);
			}
			
		});
		
		
		btnOpcao3.addActionListener((event) ->{
		
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
		revalidate();
		repaint();

		
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
			
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);
			remove(btnOpcao4);
			
			MakeReservation();
				
			
		});
		
		btnOpcao2.addActionListener((event) -> {
			
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);
			remove(btnOpcao4);
			
			seeReservations(false);
				
			
		});
		
		btnOpcao3.addActionListener((event) -> {
			
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);
			remove(btnOpcao4);
			
			seeReservations(true);
				
			
		});
		
		btnOpcao4.addActionListener((event) ->{
				
			
			remove(btnOpcao1);
			remove(btnOpcao2);
			remove(btnOpcao3);
			remove(btnOpcao4);
			
			
			
			CreateMainPage();
				

		});
		

		
		
		
	}
	
	public void MakeReservation()
	{
		revalidate();
		repaint();
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
	
	
	public void seeReservations(Boolean seeVacantSpots)
	{
		revalidate();
		repaint();
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
		revalidate();
		repaint();
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
				
				String modelo = txtModelo.getText().trim();
				int nroFileiras = Integer.parseInt(txtFileiras.getText());
				int nroAssentos = Integer.parseInt(txtAssentos.getText());
							
				if(modelo.isEmpty())
				{
					throw new IncompleteValuesException("Todos os valores devem estar preenchidos");
				}
				
				Aviao novoAviao = new Aviao(modelo, nroFileiras, nroAssentos);
				
				
				Program.avioes.add(novoAviao);
				JOptionPane.showMessageDialog(this, "Cadastrado com sucesso");
				
				txtModelo.setText("");
				txtFileiras.setText("");
				txtAssentos.setText("");
				
							
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(this, "O valor de fileiras e assentos por fileiras devem estar preenchidos por valores númericos",  "Erro!", JOptionPane.ERROR_MESSAGE);
			}
			catch(IncompleteValuesException e)
			{
				JOptionPane.showMessageDialog(this, e.getMessage(),  "Erro!", JOptionPane.ERROR_MESSAGE);
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(this, "Erro inesperado, contatar administrador do sistema!",  "Erro!", JOptionPane.ERROR_MESSAGE);
			}
			
			
		});
		
		
		btnVoltar.addActionListener((event) -> {
			
			txtModelo.setVisible(false);
			txtFileiras.setVisible(false);
			txtAssentos.setVisible(false);
			lblModelo.setVisible(false);
			lblFileiras.setVisible(false);
			lblAssentos.setVisible(false);
			btnCriar.setVisible(false);
			btnVoltar.setVisible(false);
			
			remove(txtModelo);
			remove(txtFileiras);
			remove(txtAssentos);	
			remove(lblModelo);	
			remove(lblFileiras);	
			remove(lblAssentos);	
			remove(btnCriar);	
			remove(btnVoltar);	
			
			CreateSysParamsPage();
		});
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
	}
	
	
	
	public void createFlight()
	{
		revalidate();
		repaint();
		setTitle("Cadastrar voo");
		
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat tf = new SimpleDateFormat("HH:mm");
		
		
		JLabel lblSaida = new JLabel("Local de saída: ");
		JLabel lblChegada = new JLabel("Local de chegada: ");
		JLabel lblAviao = new JLabel("Selecione o avião: ");
		
		JLabel lblData = new JLabel("Data: ");
		JLabel lblHora = new JLabel("Hora: ");
		
		
		JTextField txtSaida = new JTextField();
		JTextField txtChegada = new JTextField();
		
		JFormattedTextField txtData = new JFormattedTextField(df);
		JFormattedTextField txtHora = new JFormattedTextField(tf);
		
		
		
		JComboBox cbxAvioes = new JComboBox(Helpers.listaAvioes());
		

		JButton btnCriar = new JButton("Criar");
		JButton btnVoltar = new JButton("Voltar");
		
		
		
		lblAviao.setBounds(10,10,260,30);
		cbxAvioes.setBounds(10,35,260,30);
		
		lblSaida.setBounds(10,70,260,30);
		txtSaida.setBounds(10,95,260,30);
		
		lblChegada.setBounds(10,130,260,30);
		txtChegada.setBounds(10,155,260,30);
		
		
		lblData.setBounds(10,190,100,30);
		lblHora.setBounds(150,190,100,30);
		
		txtData.setBounds(10, 215, 120, 30);
		txtHora.setBounds(150, 215, 120, 30);
		
		btnCriar.setBounds(10,250,120,30);
		btnVoltar.setBounds(150,250,120,30);
		
		add(lblSaida);
		add(txtSaida);
		
		add(lblChegada);
		add(txtChegada);
		
		add(lblAviao);
		add(cbxAvioes);
		
		
		add(lblData);
		add(lblHora);
		add(txtData);
		add(txtHora);
		
		
		add(btnCriar);
		add(btnVoltar);
		
		btnCriar.addActionListener((event) -> {
			
			try {
				
				String modelo = cbxAvioes.getSelectedItem().toString().trim();
				String data = txtData.getText().trim();
				String hora = txtHora.getText().trim();
				String chegada = txtChegada.getText().trim();
				String saida = txtSaida.getText().trim();
				
				System.out.println(modelo);
				System.out.println(data);
				System.out.println(hora);
				System.out.println(chegada);
				System.out.println(saida);
				if(modelo.isEmpty() || data.isEmpty() || hora.isEmpty() || chegada.isEmpty() || saida.isEmpty())
				{
					throw new IncompleteValuesException("Todos os valores devem estar preenchidos");
				}
				
				int aviaoIndex = Integer.parseInt(modelo.split(" ")[0]);
				
				Aviao aviao = Program.avioes.get(aviaoIndex - 1); 
				Voo novoVoo = new Voo(aviao, saida, chegada, data, hora);
				
				
				Program.voos.add(novoVoo);
				JOptionPane.showMessageDialog(this, "Cadastrado com sucesso");
				
				
				txtData.setText("");
				txtHora.setText("");
				txtChegada.setText("");
				txtSaida.setText("");
				
				
				Helpers.listaVoos();
				
			}
			catch(IncompleteValuesException e)
			{
				JOptionPane.showMessageDialog(this, e.getMessage(),  "Erro!", JOptionPane.ERROR_MESSAGE);
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(this, "Erro inesperado, contatar administrador do sistema!",  "Erro!", JOptionPane.ERROR_MESSAGE);
			}
			
			
		});
		
		btnVoltar.addActionListener((event) -> {
				
			
		
			remove(txtData);
			remove(txtHora);	
			remove(txtChegada);	
			remove(txtSaida);	
			
			remove(lblData);	
			remove(lblHora);	
			remove(lblSaida);	
			remove(lblChegada);	
			remove(lblAviao);
			
			remove(cbxAvioes);
			
			remove(btnCriar);	
			remove(btnVoltar);	
			
			
			
			CreateSysParamsPage();
		});
			
		setSize(300, 330);
		setLayout(null);
		setVisible(true);
		
	}
	
	
	
}
