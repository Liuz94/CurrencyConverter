package currencyConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class MainMenuInterface {
	///////////////CONVERSOR MONEDAS//////////////
	ConversionLogic pesosDolar = new ConversionLogic(ConversionValor.getPesosDolar(), (String) Arquitectura.getPossibilitisConversion(0));
	ConversionLogic dolarEuro = new ConversionLogic(ConversionValor.getDolarEuro(), (String) Arquitectura.getPossibilitisConversion(1));
	ConversionLogic dolarLibra = new ConversionLogic(ConversionValor.getDolarLibras(), (String) Arquitectura.getPossibilitisConversion(2));
	ConversionLogic dolarYen = new ConversionLogic(ConversionValor.getDolarYen(), (String) Arquitectura.getPossibilitisConversion(3));
	ConversionLogic dolarWonCoreano = new ConversionLogic(ConversionValor.getDolarWonCoreano(), (String) Arquitectura.getPossibilitisConversion(4));
	
	List<ConversionLogic> lista = Arrays.asList(pesosDolar, dolarEuro, dolarLibra, dolarYen, dolarWonCoreano);
	
	public static void main(String[] args) {
		
		System.out.println());
		
		
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