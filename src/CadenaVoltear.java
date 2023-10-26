import java.util.Scanner;

public class CadenaVoltear 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String sFrase=sc.nextLine();
		String [] palabras= sFrase.split(" ");
		String sFraseInvertida=" ";
		
		for (int i=palabras.length-1; i>=0; i--)
		{
			sFraseInvertida+=palabras[i]+" ";
		}
		System.out.println("Frase invertida: "+sFraseInvertida.trim()); 
	}

}
