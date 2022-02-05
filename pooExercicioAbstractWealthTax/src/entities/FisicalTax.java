package entities;

public class FisicalTax extends Tax{
	
	private Double helthexp;

	public FisicalTax() {
		super();
	}
	
	public FisicalTax(String name, Double income, Double helthexp) {
		super(name, income);
		this.helthexp = helthexp;
	}

	public Double getHelthexp() {
		return helthexp;
	}

	public void setHelthexp(Double helthexp) {
		this.helthexp = helthexp;
	}

	@Override
	public double Tax() {
		// TODO Auto-generated method stub
		if (super.getIncome()<20000.0) {
			return super.getIncome()*.15-helthexp/2;
		}
		else {
			return super.getIncome()*.25-helthexp/2;
		}	
	}
}
	