package Entities;

public class Student {

	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double nf() {
		return n1+n2+n3;
	}
	public double missingPoints() {
		if(nf()<60) {
			return 60-nf();
		}
		else {
			return 0.0;
		}
		}
}
