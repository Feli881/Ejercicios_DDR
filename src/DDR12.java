import javax.swing.JOptionPane;

public class DDR12 {

	public static void main(String[] args)
	{
		 String texto=JOptionPane.showInputDialog(null, "Inserta una frase", "Inserción", JOptionPane.INFORMATION_MESSAGE);
		String textoSinEspacio="";
		 int contador_vocales=0;
			
			char caracterActual;
			
			for(int i=0;i<texto.length();i++)
			{
			
			caracterActual=texto.charAt(i);
			
			if (caracterActual!=' ')
			{
				textoSinEspacio+=caracterActual; 
			}
			
			}

			JOptionPane.showMessageDialog(null, textoSinEspacio ,  "Resultado",  JOptionPane.INFORMATION_MESSAGE);
	}

}
