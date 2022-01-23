package Entities;

public class Salary {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary-tax;	
	}
	public void increaseSalary(double grossSalary) {
		this.grossSalary=this.grossSalary*(1+(grossSalary/100));
	}

	public String toString () {
		return name
				+", $ "
				+netSalary();
	}
	
}
