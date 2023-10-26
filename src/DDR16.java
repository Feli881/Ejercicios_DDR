import java.util.Scanner;

public class DDR16 {

	public static void main(String[] args) {
		CompararPalabras();

	}
	
	private static void CompararPalabras()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Por favor, introduza la primera palabra");
		String palabra1 =sc.nextLine();
		
		System.out.println("Por favor, introduzca la siguiente palabra ");
		String palabra2=sc.nextLine();
		
		if(palabra1.equals(palabra2))
		{
			System.out.println("La palabras son iguales");
		}else {
			System.out.println("Las palabras no son iguales");
		}
	}

}
