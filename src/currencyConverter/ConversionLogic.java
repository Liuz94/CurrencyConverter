package currencyConverter;

public class ConversionLogic {
	
	private double conversion = 0;
	private String Procedimientos;
	
	public ConversionLogic(double conversion, String procedimietos){
		
		this.conversion = conversion;
		this.Procedimientos = procedimietos;
		
	}

	public double getConversion() {
		return conversion;
	}

	public void setConversion(double conversion) {
		this.conversion = conversion;
	}

	public String getProcedimientos() {
		return Procedimientos;
	}

	public void setProcedimientos(String procedimientos) {
		Procedimientos = procedimientos;
	}
	
}
