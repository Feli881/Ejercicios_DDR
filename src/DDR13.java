import java.util.Scanner;

public class DDR13 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un texto: ");
		String texto=sc.nextLine();
		
		String cadenaResultante="";
		
		while(!texto.isEmpty())
		{
			cadenaResultante+=texto;
			System.out.println("Introduce un texto: ");
			 texto=sc.nextLine();
		}
		System.out.println("El texto resultante ha sido: "+cadenaResultante);

	}

}
