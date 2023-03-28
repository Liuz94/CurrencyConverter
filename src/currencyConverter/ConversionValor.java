package currencyConverter;

public class ConversionValor {
	private static double pesosDolar = 0.054;
	private static double dolarEuro = 0.92;
	private static double dolarLibras = 0.82;
	private static double dolarYen = 131.44;
	private static double dolarWonCoreano = 1296.45;
	
	private static double centigradosKelvin = 273.15;
	private static double centigradosFarenheit = 32;
	private static double kelvinFarenheit = 0;
	
	public static double getPesosDolar(int modo, double valor) {
		//// 2 Dolar a Pesos. 1 Peos a dolar
		if(modo == 2) {
			return valor / pesosDolar;
		}
		return valor * pesosDolar;
	}


	public static double getDolarEuro(int modo, double valor) {
		if (modo == 2) {
			return valor / dolarEuro;
		}
		return valor * dolarEuro;
	}


	public static double getDolarLibras(int modo, double valor) {
		if (modo == 2) {
			return valor / dolarLibras;
		}
		return valor * dolarLibras;
	}

	public static double getDolarYen(int modo, double valor) {
		if (modo == 2) {
			return valor / dolarYen;
		}
		return valor * dolarYen;
	}

	public static double getDolarWonCoreano(int modo, double valor) {
		if (modo == 2) {
			return valor / dolarWonCoreano;
		}
		return valor * dolarWonCoreano;
	}


	public static double getCentigradosKelvin(int modo, double valor) {
		// 1 Centigrados a Kelvin, 2 Kelvin Centigrados 
		if (modo == 1) {
			return valor + 273.15;
		}
		return valor - 273.15;
	}


	public static double getCentigradosFarenheit(int modo, double valor) {
		//1 Centigrados A F, 2 F a Centigrados
		if(modo == 1 ) {
			return ((valor * 1.8) + 32) ;
		}
		return ((valor - 32 )* 0.56);
	}


	public static double getKelvinFarenheit(int modo, double valor) {
		// 1 Kelvin a F , 2 F a Kelvin
		if(modo == 1 ) {
			return (((valor - 273.15) * 1.8) + 32);
		}
		return (((valor - 32) * 0.56) + 273.15);
	}
	
	

}
