import java.util.Scanner;

public class ClaseMartes {

	public static void main(String[] args) 
	{
		//ObtenerCodigoAscii();
		//EscribirAbecedario();
		//PintarMitadAbecedario();
		//PintarMitadAbecedario2();
		PintarAbecedarioTodoJunto();
	}
	private static void PintarAbecedarioTodoJunto()
	{
		for (int i=65; i<91; i++)
		{
			char caracterMa =(char)i;
			char caracterMi=(char)(i+32);
			System.out.println(caracterMa+ "-"+caracterMi);
			System.out.println(" ");
		}
		
	}
	
	private static void PintarMitadAbecedario()
	{
		for (int i=97; i<124; i=i+2)
		{
			char caracter =(char)i;
			System.out.println(caracter);
		}
	}
	private static void PintarMitadAbecedario2()
	{
		for (int i=124; i>97; i--)
		{
			char caracter =(char)i;
			System.out.println(caracter);
		}
	}
	
	private static void EscribirAbecedario() 
	{
		for (int i=65; i<123;)
		{
			if(!(i>90 && i<97))
			{
				char caracter=(char)i;
				System.out.println(caracter);
			}
		}
		
	}
	
	private static void ObtenerCodigoAscii()
	{
		Scanner sc=new Scanner (System.in);
		char caracter=sc.next().charAt(0);
		int cod=(int) caracter;
		System.out.println("Su código Ascii es: "+cod);
	}
}
