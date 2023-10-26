import java.util.Scanner;

public class DDR9 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Introduce un número entero mayor que 1: "); 
		int num;
		
		do
		{
			num=sc.nextInt();
			if (num<=1)
			{
				System.out.println("Error, vuelve a intentarlo ");
				
			}
		}while(num<=1);
		
		int suma=0;
		
		for(int i=0; i<=num; i++)
		{
			suma+=i;
		
		}
		System.out.println("El resultado es: " +suma);
	}	

}
