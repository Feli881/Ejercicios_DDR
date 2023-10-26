import java.util.Scanner;

public class Capicua {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número:");
		String Numero=sc.next();
		char [] aNumero=Numero.toCharArray();
		String NumerosReves="";
		for (int i=aNumero.length-1;i<0;i--)
		{
			NumerosReves=NumerosReves+aNumero[i];
		}
		if (Numero.contentEquals(NumerosReves))
		{
			System.out.println("El número "+Numero+" es capícua");
		} 
		else
		{
			System.out.println("El número "+Numero+ " no es capícua");
		}
		boolean bCapicua=true; 
		for (int i=0; i<aNumero.length/2; i++)
		{
			if(aNumero[i]!=aNumero[aNumero.length-i-1])
			{
				System.out.println("No es capícua");
				bCapicua=false; 
				break; 
			}
			if (bCapicua)
			{
				System.out.println("Es capícua"); 
			}
			
		}
	}
}
