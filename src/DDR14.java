import java.util.Scanner;

public class DDR14 {

	public static void main(String[] args)
	{
		
		Convertir();
		
		
	}
	private static void Convertir()
	{
		Scanner sd=new Scanner(System.in);
		System.out.println("Introduce un texto: ");
		String texto=sd.nextLine();
		
		System.out.println("¿Quieres convertir la frase a mayúsculas o minúsculas? (M para mayúsculas y m para minúsculas");
		
		String opcion=sd.nextLine();
		if(opcion.equalsIgnoreCase("M")) {
		
			System.out.println("Frese en mayúsuclas" +opcion.toUpperCase())	;
		}else if(opcion.equalsIgnoreCase("m"))
		{
			System.out.println("Fase en minúsculas"+opcion.toLowerCase());
		}else{
			System.out.println("Opción no válida"+opcion);
		}
	}
		   
}
