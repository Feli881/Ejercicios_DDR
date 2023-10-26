import java.util.Scanner;

public class NumeroContador {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		/*for (int i=1; i<=27 ;i++)
		{
			System.out.print(i+"-");
		}*/
		
		/*for (int i=27; i>0 ;i--)
		{
			System.out.print(i+"-");
		}*/
		/*for (int i=1; i<=27 ;i=i+2)
		{
			System.out.print(i+"-");
		}*/
		/*for (int i=27; i>0 ;i=i-3)
		{
			System.out.print(i+"-");
		}*/
		/*for(int i=2; i<100; i=i+2)
		{
			System.out.print(i+"-");
		}*/
		System.out.println("Qué número desea multiplicar");
		int Numero=sc.nextInt();
		
	        for(int i = 1; i <= 10; i++){
	            System.out.println(Numero + " x " + i + " = " + Numero * i);
	        }
		

	}

}
