import java.util.Scanner;

public class DDR15 {

	public static void main(String[] args) 
	{
		//ContarCadena();
		CadenaContar();
	}
	private static void ContarCadena()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce una frase");
		String cadena=sc.nextLine();
		
		System.out.println("La cadena tiene "+cadena.length()+" caracteres");
	}
	
	private static void CadenaContar()
	{
		Scanner sc=new Scanner(System.in);
		boolean entradaContar=false;
		
		while(!entradaContar)
		{	
			System.out.println("Introduce una frase");
			String cadena=sc.nextLine();
			
			entradaContar=true;
			System.out.println("La cadena tiene "+cadena.length()+" caracteres");
		}
		
	}
	

}
