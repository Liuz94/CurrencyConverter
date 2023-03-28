package currencyConverter;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MainMenuInterface {
	///////////////CONVERSOR MONEDAS//////////////
	
	public static void main(String[] args) {

		
		String menuPrincipal = (String)JOptionPane.showInputDialog(null, "Escoge la conversion\n", "Currency "
				+ "Converted", JOptionPane.PLAIN_MESSAGE, null, Arquitectura.getPossibilitis(),"Conversor Monedas");
		
		
		if(Arquitectura.getPossibilitis(0).equals(menuPrincipal)) {
			ConversionMonedas();
		}else {
			ConversionTemperatura();
		}
	}
	
	
	public static void ConversionMonedas() {
		double valorMoneda = 0;
		ConversionLogic convertidor  = new ConversionLogic();
		
		String eleccionConversion = (String)JOptionPane.showInputDialog(null, "Escoge la conversion\n", "Currency "
				+ "Converted", JOptionPane.PLAIN_MESSAGE, null, Arquitectura.getPossibilitisConversion(),"Conversor Monedas");
		
		try {
			valorMoneda = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese valor a convertir"));
			DecimalFormat decimalFormat = new DecimalFormat("###.##");
			
			JOptionPane.showMessageDialog(null, "Su resultado de conversion" + " " + eleccionConversion+ " son $" + 
					decimalFormat.format(convertidor.getConversion(valorMoneda, eleccionConversion)));
				EleccinFinalizarPrograma();
				
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos con punto.");
			CancelarPrograma();
		}
		
	}
	
	public static void ConversionTemperatura() {
		double valorTemperatura = 0;
		ConversionLogic convertidor  = new ConversionLogic();
		
		String eleccionConversionTemperatura = (String)JOptionPane.showInputDialog(null, "Escoge la conversion\n", "Temperature "
				+ "Converted", JOptionPane.PLAIN_MESSAGE, null, Arquitectura.getPosibilidadesTemperatura(),"Conversor Temperatura");
		
		try {
			
			valorTemperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese valor a convertir"));
			DecimalFormat decimalFormat = new DecimalFormat("###.##");
			
			JOptionPane.showMessageDialog(null, "Su resultado de conversion" + " " + eleccionConversionTemperatura  + " son $" + 
					decimalFormat.format(convertidor.getconversionTemperatura(valorTemperatura, eleccionConversionTemperatura)));
			EleccinFinalizarPrograma();
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos con punto.");
			CancelarPrograma();
		}
	}
	
	public static void EleccinFinalizarPrograma() {
		// 0 SI, 1 NO, 2 CACNCELAR;
		int eleccionContinuar =  JOptionPane.showConfirmDialog(null, "Desea Continuar?");
		switch(eleccionContinuar) {
		case 0: main(null);
		case 1: CancelarPrograma(); break;
		case 2: CancelarPrograma();	break;
		}
	}
	
	public static void CancelarPrograma() {
		JOptionPane.showMessageDialog(null,"Programa Finalizado");
		System.exit(0);
	}
	
}