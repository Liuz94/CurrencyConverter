package currencyConverter;
import javax.swing.JOptionPane;

public class MainMenuInterface {
	
	public static void main(String[] args) {
		String menuPrincipal = (String)JOptionPane.showInputDialog(null, "Escoge la conversion\n", "Currency "
				+ "Converted", JOptionPane.PLAIN_MESSAGE, null, privateStrings.getPossibilitis(),"Conversor Monedas");
		
		if(privateStrings.getPossibilitis(0).equals(menuPrincipal)) {
			ConversionMonedas();
		}
	}
	
	public static void ConversionMonedas() {
		String eleccionConversion = (String)JOptionPane.showInputDialog(null, "Escoge la conversion\n", "Currency "
				+ "Converted", JOptionPane.PLAIN_MESSAGE, null, privateStrings.getPossibilitisConversion(),"Conversor Monedas");
		
		double valorMoneda = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese valor a convertir"));

		//numberFormatEXcer
	}

}