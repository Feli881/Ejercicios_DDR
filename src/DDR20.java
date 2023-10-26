import java.util.Scanner;

public class DDR20 {

	public static void main(String[] args) {
		DeterminarPosicion();
	}

	private static void DeterminarPosicion() {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\n");
		
		System.out.println("Introduzca una frase: ");
		String sFrase=sc.next();
		
		int iPosi=sFrase.indexOf('a');
		
		System.out.println(iPosi);
		
		iPosi=sFrase.indexOf('a',iPosi+1);
		System.out.println(iPosi);
	}

}
