import java.util.Scanner;

public class DDR5 {

	public static void main(String[] args)
	{
		Scanner sn=new Scanner (System.in);
		System.out.println("Introduzca el primer número"); 
		int num1=sn.nextInt();
		
		System.out.println("Introduzca el segundo número");
		int num2=sn.nextInt();
		
		if(num1<=num2)
		{
			if(num1==num2)
			{
				System.out.println("Son iguales");
			}
			else
			{
				System.out.println("El número "+num2+" es el mayor");
			}
		}
		else 
		{
			System.out.println("El número "+num1+" es el mayor");
		}

	}

}
