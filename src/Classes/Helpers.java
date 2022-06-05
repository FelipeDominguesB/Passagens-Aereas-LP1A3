package Classes;

public class Helpers {

	public static String[] listaAvioes()
	{
		String aviaoArray[] = new String[Program.avioes.size()];
		
		int i = 0;
		for(Aviao aviao : Program.avioes)
		{
			aviaoArray[i] = (i+1) + " - " + aviao.getModelo();
			i++;
		}
		
		return aviaoArray;
		
	}
	
	
	
	
	public static String[] listaVoos()
	{
		String vooArray[] = new String[Program.voos.size()];
		
		int i = 0;
		for(Voo voo : Program.voos)
		{
			vooArray[i] = voo.getNro() + " - " + voo.getSaidaEm() + " - " + voo.getChegadaEm() + " (" + voo.getData() + " " + voo.getHora() + ")";
			i++;
		}
		
		return vooArray;
		
	}
	
	
	public static Voo getVooByNro(int nro)
	{
		Voo voo = null;
		
		for(Voo voos : Program.voos)
		{
			if(voos.getNro() == nro)
			{
				voo = voos;
			}
		}
		
		return voo;
	}
	
	public static String[] createRowsArray(Voo voo)
	{
		int nroFileiras = voo.getAeronave().getFileiras();
		String Fileiras[] = new String[nroFileiras];
		int i = 0;
		
		for(i =0; i < nroFileiras; i++)
		{
			Fileiras[i] = Integer.toString(i+1);
		}
		
		
		return Fileiras;
	}
	
	public static String[] createColumnsArray(Voo voo)
	{
		int nroAssentos = voo.getAeronave().getAssentosPorFileira();
		String Assentos[] = new String[nroAssentos];
		int i = 0;
		
		for(i =0; i < nroAssentos; i++)
		{
			Assentos[i] = Integer.toString(i+1);
		}
		
		
		return Assentos;
	}
	
	
	
	public static Object[][] getFlightSeats(Voo voo, boolean seeVacant)
	{
		
		int nroFileiras = voo.getAeronave().getFileiras();
		int nroAssentos = voo.getAeronave().getAssentosPorFileira();
		Object[][] dados  = new Object[nroFileiras*nroAssentos][3];
		int linha = 0;
		for(int i = 1; i <= nroFileiras; i++)
		{
			for(int j = 1; j <= nroAssentos; j++)
			{
				
				if(voo.getAeronave().verificaLugarOcupado(i, j) && !seeVacant)
				{
					dados[linha][0] = Integer.toString(i);
					dados[linha][1] = Integer.toString(j);
					dados[linha][2] = voo.getAeronave().getPassageiro(i, j).getNome();
					linha++;
				}
				else if(!voo.getAeronave().verificaLugarOcupado(i, j) && seeVacant) {
					dados[linha][0] = Integer.toString(i);
					dados[linha][1] = Integer.toString(j);
					dados[linha][2] = "Disponivel";
					linha++;
				}
				
				
			}
		}

		return dados;
	}
}
