package entities;

public class EnterpriseTax extends Tax{
	private Integer numberOfEmployess;
	
	public EnterpriseTax() {
		super();
	}
	
	public EnterpriseTax(String name, Double income, Integer numberOfEmployess) {
		super(name, income);
		this.numberOfEmployess = numberOfEmployess;
	}

	@Override
	public double Tax() {
		// TODO Auto-generated method stub
		if (numberOfEmployess>10) {
		return super.getIncome()*.14 ;
		}
		else {
		return super.getIncome()*.16 ;
		}
	}
}
