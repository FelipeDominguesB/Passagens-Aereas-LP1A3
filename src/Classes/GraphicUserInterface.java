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
		boolean temVoos = Program.voos.size() > 0;
		
		
		add(btnOpcao1);
		add(btnOpcao2);
		add(btnOpcao3);
		add(btnOpcao4);
		
		btnOpcao1.setBounds(10,10,260,30);
		btnOpcao2.setBounds(10,60,260,30);
		btnOpcao3.setBounds(10,110,260,30);
		btnOpcao4.setBounds(10,200,260,30);
		
		
		btnOpcao1.addActionListener((event) -> {
			
			if(temVoos)
			{
				remove(btnOpcao1);
				remove(btnOpcao2);
				remove(btnOpcao3);
				remove(btnOpcao4);
				
				MakeReservation();
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Não é possível fazer reservas cadastrar um voo sem que haja o cadastro de aviões no sistema",  "Erro!", JOptionPane.ERROR_MESSAGE);
			}
				
			
		});
		
		btnOpcao2.addActionListener((event) -> {
			
			if(temVoos)
			{
				remove(btnOpcao1);
				remove(btnOpcao2);
				remove(btnOpcao3);
				remove(btnOpcao4);
				
				seeReservations(false);
			}
			else {
				
			}
				
			
		});
		
		btnOpcao3.addActionListener((event) -> {
			
			
			if(temVoos)
			{
				remove(btnOpcao1);
				remove(btnOpcao2);
				remove(btnOpcao3);
				remove(btnOpcao4);
				
				seeReservations(true);
			}
			else {
				
			}
				
			
		});
		
		btnOpcao4.addActionListener((event) ->{
				
			
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
		revalidate();
		repaint();
		setTitle("Fazer reserva");
	
		JLabel lblNome = new JLabel("Nome do viajante: ");
		JLabel lblCpf = new JLabel("CPF do viajante: ");
		
		JLabel lblVoo = new JLabel("Voo: ");
		
		JLabel lblFileira = new JLabel("Fileira: ");
		JLabel lblAssento = new JLabel("Assento: ");
		
		JTextField txtNome = new JTextField();
		JTextField txtCpf = new JTextField();
		JButton btnCriar = new JButton("Criar");
		JButton btnVoltar = new JButton("Voltar");
		
		
		String arrayVoos[] = Helpers.listaVoos();
		String arrayFileiras[] = Helpers.createRowsArray(Program.voos.get(0));
		String arrayAssentos[] = Helpers.createColumnsArray(Program.voos.get(0));
		
		
		
		JComboBox<String> cbxVoos = new JComboBox<>(arrayVoos);
		JComboBox<String> cbxFileira = new JComboBox<>(arrayFileiras);
		JComboBox<String> cbxAssento = new JComboBox<>(arrayAssentos);
		
		
		
		add(lblNome);
		add(txtNome);
		add(lblCpf);
		add(txtCpf);
		
		add(lblVoo);
		add(cbxVoos);
		
		add(lblFileira);
		add(lblAssento);
		add(cbxFileira);
		add(cbxAssento);
		
		add(btnCriar);
		add(btnVoltar);
		
		lblNome.setBounds(10,10,360,30);
		txtNome.setBounds(10,35, 360,30);
		
		lblCpf.setBounds(10,70,360,30);
		txtCpf.setBounds(10,95,360,30);
		
		lblVoo.setBounds(10,130,360,30);
		cbxVoos.setBounds(10, 155, 360, 30);
		
		lblFileira.setBounds(10,190,135,30);
		lblAssento.setBounds(235,190,135,30);
		
		cbxFileira.setBounds(10, 215, 135, 30);
		cbxAssento.setBounds(235, 215, 135, 30);
		
		btnCriar.setBounds(10,260,135,30);
		btnVoltar.setBounds(235,260,135,30);
		
		
		
		cbxVoos.addActionListener((event) ->{
			
			
			int nroVoo = Integer.parseInt(cbxVoos.getSelectedItem().toString().split(" ")[0]);
			
			Voo voo = Helpers.getVooByNro(nroVoo);
			
			
			String newArrayFileiras[] = Helpers.createRowsArray(voo);
			String newArrayAssentos[] = Helpers.createColumnsArray(voo);
			DefaultComboBoxModel<String> listaFileiras = new DefaultComboBoxModel<>(newArrayFileiras);
			DefaultComboBoxModel<String> listaAssentos= new DefaultComboBoxModel<>(newArrayAssentos);
			cbxFileira.setModel( listaFileiras );
			cbxAssento.setModel( listaAssentos );
			
		});
		
		btnCriar.addActionListener((event) -> {
			
			try {
				
				boolean reservou;
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				String vooSelecionado = cbxVoos.getSelectedItem().toString().split(" ")[0];
				String fileira = cbxFileira.getSelectedItem().toString();
				String assento = cbxAssento.getSelectedItem().toString();
				
				if(nome.isEmpty() || cpf.isEmpty() || vooSelecionado.isEmpty() || assento.isEmpty() || fileira.isEmpty())
				{
					throw new IncompleteValuesException("Todos os valores devem estar preenchidos");
				}
				
				Passageiro passageiro = new Passageiro(nome, cpf);
				
				int nroVoo = Integer.parseInt(vooSelecionado);
				int nroFileira = Integer.parseInt(fileira);
				int nroAssento = Integer.parseInt(assento);
				
				
				
				Voo voo = Helpers.getVooByNro(nroVoo);
				
				if(voo == null) throw new Exception();
				
				reservou = voo.getAeronave().setPassageiro(passageiro, nroFileira, nroAssento);
				
				if(reservou)
				{
					JOptionPane.showMessageDialog(this, "Cadastrado com sucesso");
					
					
					txtNome.setText("");
					txtCpf.setText("");
					txtCpf.setText("");
					cbxVoos.setSelectedIndex(0);
					cbxFileira.setSelectedIndex(0);
					cbxAssento.setSelectedIndex(0);
				}
				else {
					JOptionPane.showMessageDialog(this, "Erro, lugar já ocupado, favor selecionar outra posição!",  "Erro!", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
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
			
			
			
			remove(lblNome);
			remove(txtNome);
			remove(lblCpf);
			remove(txtCpf);
			
			remove(lblVoo);
			remove(cbxVoos);
			
			remove(lblFileira);
			remove(lblAssento);
			remove(cbxFileira);
			remove(cbxAssento);
			
			remove(btnCriar);
			remove(btnVoltar);
			
			
			
			CreatePassageReservationPage();
		});
		
		
		setSize(400, 340);
		setLayout(null);
		setVisible(true);
			
		
	}
	
	
	public void seeReservations(Boolean seeVacantSpots)
	{
		revalidate();
		repaint();
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
		
		
		
		JComboBox<String> cbxAvioes = new JComboBox<>(Helpers.listaAvioes());
		

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
				Aviao newAviao = new Aviao(aviao.getModelo(), aviao.getFileiras(), aviao.getAssentosPorFileira());
				Voo novoVoo = new Voo(newAviao, saida, chegada, data, hora);
				
				
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
