package currencyConverter;

public class privateStrings {
	private static Object[] possibilitis = {"Conversor Moneda" , "Conversor Temperatura"};
	
	private static Object[] possibilitisConversion = {"De Pesos a Dolar", "De Dolar a Euros", "De Dolar a Libras",
			"De Dolar a Yen", "De Dolar a Won Coreano", "De Dolar a Pesos", "De Euros a Dolar",
			"De Libras a Dolar", "De Yen a Dolar", "De Won Correano a Dolar"};

	public static Object[] getPossibilitis() {
		return possibilitis;
	}
	public static Object getPossibilitis(int posicion) {
		return (possibilitis[posicion]);
	}
	
	public static Object[] getPossibilitisConversion() {
		return possibilitisConversion;
	}
	public static Object getPossibilitisConversion(int posicion) {
		return (possibilitis[posicion]);
	}
}
