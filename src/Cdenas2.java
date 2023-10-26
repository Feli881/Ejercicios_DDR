import java.util.Scanner;

public class Cdenas2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe una frase");
		sc.useDelimiter("\n");
		
		String sFrase=sc.next(); 
		char[] aLetras=sFrase.toCharArray();
		String sNum="";
		for (char c:aLetras)
		{
			if(Character.isDigit(c))
			{
				sNum=sNum+c;
			}
		}
		System.out.println(sNum);
		String sFraseSinNum=sFrase.replace(sNum, "xxx");
		System.out.println(sFraseSinNum);
	}

}
