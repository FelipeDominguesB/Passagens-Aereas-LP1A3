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
			System.out.println("");
			System.out.println("Nº: " + voo.getNro());
			System.out.println("Data: " + voo.getData());
			System.out.println("Hora: " + voo.getHora());
			System.out.println("Saida em: " + voo.getSaidaEm());
			System.out.println("Chegada em: " + voo.getChegadaEm());
			System.out.println("Avião: " + voo.getAeronave().getModelo());
			System.out.println("");
			
			i++;
		}
		
		return vooArray;
		
	}
}
