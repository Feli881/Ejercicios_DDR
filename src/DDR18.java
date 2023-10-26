import java.util.Scanner;

public class DDR18 {

	public static void main(String[] args) {
		
		SeparadorPalabra();
	}

	private static void SeparadorPalabra() {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\n");
		System.out.println("Escribre una frase");
		String sFrase=sc.next();
		
		String[] palabras=sFrase.split(" ");
		
		for(int i=0; i<palabras.length; i++)
		{
			System.out.println(palabras[i]);
		}
		
	}
	

}
