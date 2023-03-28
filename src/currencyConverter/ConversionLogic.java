package currencyConverter;

public class ConversionLogic {
	
	private double conversion = 0;
	private double conversionTemperatura = 0;

	public double getConversion(double conversion, String procedimietos) {
		switch(procedimietos) { 
		case "De Pesos a Dolar": return ConversionValor.getPesosDolar(1, conversion);
		case "De Dolar a Euros": return ConversionValor.getDolarEuro(1, conversion);
		case "De Dolar a Libras": return ConversionValor.getDolarLibras(1, conversion);
		case "De Dolar a Yen" : return ConversionValor.getDolarYen(1, conversion);
		case "De Dolar a Won Coreano" : return ConversionValor.getDolarWonCoreano(1, conversion);
		
		case  "De Dolar a Pesos" : return ConversionValor.getPesosDolar(2, conversion);
		case  "De Euros a Dolar" : return ConversionValor.getDolarEuro(2, conversion);
		case "De Libras a Dolar" : return ConversionValor.getDolarLibras(2, conversion);
		case "De Yen a Dolar" : return ConversionValor.getDolarYen(2, conversion);
		case "De Won Correano a Dolar" : return ConversionValor.getDolarWonCoreano(2, conversion);
		}
		return 999999;
	}
	
	public double getconversionTemperatura(double conversion, String seleccion) {
		switch(seleccion) {
		case "De Centigrados a Kelvin": return ConversionValor.getCentigradosKelvin(1, conversion);
		case "De Kelvin a Centigrados": return ConversionValor.getCentigradosKelvin(2, conversion);
		case "De Centigrados a Farenheit": return ConversionValor.getCentigradosFarenheit(1, conversion);
		case "De Farenheit a Centigrados": return ConversionValor.getCentigradosFarenheit(2, conversion);
		case "De Kelvin a Farenheit": return ConversionValor.getKelvinFarenheit(1,conversion);
		case "De Farenheit a Kelvin": return ConversionValor.getKelvinFarenheit(2, conversion);
		}
		return 999999;
	}

	
}
