import java.util.Scanner;

public class DDR4 
{

	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		int numero=sn.nextInt();
		
		if (numero%2==0)
		{
			System.out.println("El número "+numero+" es par");
		}
		else 
		{
			System.out.println("El número "+numero+" no es par");
		}
		

	}

}
