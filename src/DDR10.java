import java.util.Scanner;

public class DDR10 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número"); 
		int num=sc.nextInt();
		int contador=0;
		int suma=0;
		while(num!=-1)
		{
			contador++; 
			suma=suma+contador;
			//System.out.println(num);
			num=sc.nextInt();
		}
		
		System.out.println("Fin, se han introducido un total de "+contador+" y la suma de los mismo es " +suma); 
	}

}
