import java.util.Scanner;

public class DDR17 {

	public static void main(String[] args) {
		
		//ExtraerCaracter();
		ExtraerCaracteres();
	}
	
	private static void ExtraerCaracter()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca una cadena");
		String cadena=sc.nextLine();
		
		if(cadena.length()>=5)
		{
			System.out.println("La cuarta y quinta letra de la cadena son: "+cadena.substring(2,5));
		}
		else {
			System.out.println("La cadena es demasiado corta.");
		}
		
	}
	
	private static void ExtraerCaracteres()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca una cadena");
		String cadena=sc.nextLine();
		String []palabras=cadena.split(" ");
		
		for(String palabra: palabras)
		{
			if(palabra.length()>=4) {
				System.out.println("La segunda y cuarda letra de la palabra "+palabra+" son: "+palabra.substring(1,2)+" y "  +palabra.substring(3, 4));
			}else {
				System.out.println("La palabra "+palabra+" es demasiado corta.");
			}
		}
	}

}
