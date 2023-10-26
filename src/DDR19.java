import java.util.Scanner;

public class DDR19 {

	public static void main(String[] args) {
		
		ReemplazarCaracter();
	}

	private static void ReemplazarCaracter() {
		
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\n");
		
		System.out.println("Introduce una frase");
		String sFrase=sc.next();
		
		sFrase=sFrase.replace("a","e");
		sFrase=sFrase.replace("e","u");
		
		System.out.println(sFrase);
	}

}
