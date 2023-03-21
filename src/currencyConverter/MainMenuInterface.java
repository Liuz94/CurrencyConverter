package currencyConverter;

import javax.swing.JOptionPane;

public class MainMenuInterface {
	
	public static void main(String[] args) {
		Object[] possibilitis = {"Conversor Moneda" , "Conversor Temperatura"};
		String s = (String)JOptionPane.showInputDialog(null, "Escoge la conversion\n", "Currency Converted", JOptionPane.PLAIN_MESSAGE, null, possibilitis,"Conversor Monedas");
	}

}