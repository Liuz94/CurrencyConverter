package currencyConverter;
import javax.swing.JOptionPane;

public class MainMenuInterface {
	
	public static void main(String[] args) {
		String menuPrincipal = (String)JOptionPane.showInputDialog(null, "Escoge la conversion\n", "Currency "
				+ "Converted", JOptionPane.PLAIN_MESSAGE, null, Arquitectura.getPossibilitis(),"Conversor Monedas");
		
		if(Arquitectura.getPossibilitis(0).equals(menuPrincipal)) {
			ConversionMonedas();
		}
	}
	
	public static void ConversionMonedas() {
		String eleccionConversion = (String)JOptionPane.showInputDialog(null, "Escoge la conversion\n", "Currency "
				+ "Converted", JOptionPane.PLAIN_MESSAGE, null, Arquitectura.getPossibilitisConversion(),"Conversor Monedas");
		
		double valorMoneda = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese valor a convertir"));
		ResultadoConversion(eleccionConversion, valorMoneda);
		
		if(Arquitectura.getPossibilitisConversion().equals(eleccionConversion)) {
			System.out.println(Arquitectura.getPossibilitisConversion());
		}
	}
	public static void ResultadoConversion(String eleccionConversion, double valorMoneda) {
		
	}

}