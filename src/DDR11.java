import javax.swing.JOptionPane;

public class DDR11 {

	public static void main(String[] args) 
	{
		/*String texto=JOptionPane.showInputDialog(null, "Escriba una cadena: ", " Inserción", JOptionPane.INFORMATION_MESSAGE );
		texto=texto.toLowerCase();
		
		char vocales[]= {'a','e','i','o','u'}; 
		
		char caracterActual; 
		int contadorVocales=0;
		boolean esVocal=false;
		
		for(int i=0; i<texto.length(); i++)
		{
			caracterActual=texto.charAt(i);
			esVocal=false; 
			
			for(int j=0; j<vocales.length && !esVocal; j++)
			{
				if(vocales[j]==caracterActual)
				{
					contadorVocales++; 
					esVocal=true; 
				} 
			}
		}
		JOptionPane.showMessageDialog(null, "La frase tiene " +contadorVocales+" vocales","Resultado", JOptionPane.INFORMATION_MESSAGE);*/
		
		
		   String texto=JOptionPane.showInputDialog(null, "Inserta una frase", "Inserción", JOptionPane.INFORMATION_MESSAGE);
				//lo pasamos a minusculas para igualar todas las letras
				texto=texto.toLowerCase();
				
				int contador_vocales=0;
				
				char caracterActual;
				
				for(int i=0;i<texto.length();i++){
				
				caracterActual=texto.charAt(i);
				
				//otra forma de comparar
				if( caracterActual=='a' ||
				caracterActual=='e' ||
				caracterActual=='i' ||
				caracterActual=='o' ||
				caracterActual=='u'){
				contador_vocales++; //aumeta el contador
				}
				
				}

				JOptionPane.showMessageDialog(null, "La frase tiene "+contador_vocales+" vocales", "Resultado",  JOptionPane.INFORMATION_MESSAGE);

	}

}
